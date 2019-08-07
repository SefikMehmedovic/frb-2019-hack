package org.frb.stls.hack.hackservice;

import org.frb.stls.hack.hackservice.persistence.entiy.Answer;
import org.frb.stls.hack.hackservice.persistence.entiy.Game;
import org.frb.stls.hack.hackservice.persistence.entiy.Player;
import org.frb.stls.hack.hackservice.persistence.entiy.Question;
import org.frb.stls.hack.hackservice.persistence.repositories.AnswerRepository;
import org.frb.stls.hack.hackservice.persistence.repositories.GameRepository;
import org.frb.stls.hack.hackservice.persistence.repositories.PlayerRepository;
import org.frb.stls.hack.hackservice.persistence.repositories.QuestionRepository;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;


import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Controller
@RequestMapping("/api/")
public class GameService {
    private static final Integer DEFAULT_QUESTION_NUMBERS = 10;
    private static final Integer BONUS_SCORE = 1;
    private static long playerCount = 0;

    @Inject
    private QuestionAnswerService questionAnswerService;
    @Inject
    private PlayerRepository playerRepository;
    @Inject
    private GameRepository gameRepository;
    @Inject
    private QuestionRepository questionRepository;
    @Inject
    private AnswerRepository answerRepository;

    private static Map<Integer, List<Question>> gameQuestionsMap = new ConcurrentHashMap<>();
    private static Map<Integer, Date> answerTimeMap = new ConcurrentHashMap<>();

    @GetMapping(value = "/games/{gameId}")
    @ResponseBody
    public Game getGame(@PathVariable(name = "gameId") Integer gameId) {
        return gameRepository.getOne(gameId);
    }

    //to test this endppoint, run in dow window: curl --request POST http://localhost:8080/api/players
    @PostMapping(value = "/players")
    @ResponseBody
    public Player playGame() {
        Date currentTime = Calendar.getInstance().getTime();
        List<Game> games = gameRepository.findAll();

        Game nextGame = games.stream()
                .filter(game-> isStartTimeAfterCurrentTime(game.getStartTime(), currentTime))
                .findFirst().orElse(null);

        Player newPlayer = new Player();
        newPlayer.setGameId(nextGame.getId());
        playerRepository.save(newPlayer);

        newPlayer.setName("Player_" + newPlayer.getId());
        playerRepository.save(newPlayer);
        playerCount++;
        return newPlayer;
    }

    @GetMapping(value = "/games/{gameId}/questions")
    @ResponseBody
    public List<Question> getQuestions(@PathVariable(name = "gameId") Integer gameId) {
        //populate te questions for this game
        if (gameQuestionsMap.isEmpty() || gameQuestionsMap.get(gameId) == null) {
            List<Question> questions = questionAnswerService.getQuestions(DEFAULT_QUESTION_NUMBERS);
            gameQuestionsMap.put(gameId, questions);
        }

        //keep the map contains only two game ids
        if (gameQuestionsMap.size() > 2) {
            Integer smallestgameId = gameQuestionsMap.keySet().stream().mapToInt(i -> i).min().orElse(0);

            //remove the question list for this game from the map
            gameQuestionsMap.remove(smallestgameId);
        }

        return gameQuestionsMap.get(gameId);
    }

    //to test this endppoint, run in dow window: curl --request POST http://localhost:8080/api/players/1/answer/1
    @PostMapping(value = "/players/{playerId}/answer/{answerId}")
    @ResponseBody
    public Player saveAnswer(@PathVariable(name = "answerId") Integer answerId, @PathVariable(name = "playerId") Integer playerId) {
        Player player = null;
        if (answerId != null) {
            player = playerRepository.getOne(playerId);
            Answer answer = answerRepository.getOne(answerId);
            if (answer.getCorrect()) {
                player.setScore(player.getScore() + 1);
            }
            //check if the bonus applies
            if (answerTimeMap.isEmpty()) {
                player.setScore(player.getScore() + BONUS_SCORE);
            }
            else {
                //don't want the map keep growing
                answerTimeMap.clear();
            }
            answerTimeMap.put(playerId, Calendar.getInstance().getTime());

            playerRepository.save(player);
        }

        return player;
    }

    private boolean isStartTimeAfterCurrentTime(Date startTime, Date currentTime) {
        if (startTime.getHours() < currentTime.getHours()) {
            return false;
        }
        if (startTime.getHours() > currentTime.getHours()) {
            return true;

        } else {
            return (startTime.getMinutes() > currentTime.getMinutes());
        }
    }
}
