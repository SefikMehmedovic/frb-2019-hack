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

import javax.inject.Inject;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class GameService {
    private static final Integer DEFAULT_QUESTION_NUMBERS = 10;
    private static long playerCount = 1;

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


    public List<Question> getQuestions(Integer questionNumvers) {
        if (questionNumvers == null) {
            questionNumvers = DEFAULT_QUESTION_NUMBERS;
        }

       return questionAnswerService.getQuestions(questionNumvers);
    }

    public Player playGame() {
        Date currentTime = Calendar.getInstance().getTime();
        List<Game> games = gameRepository.findAll();

        Game nextGame = games.stream()
                .filter(game-> game.getStartTime().after(currentTime))
                .findFirst().orElse(null);

        Player newPlayer = createPlayer();
        newPlayer.setGameId(nextGame.getId());
        playerRepository.save(newPlayer);

        return newPlayer;
    }

    public void saveAnswer(Integer answerId, Integer playerId) {
        if (answerId != null) {
            Player player = playerRepository.getOne(playerId);
            Answer answer = answerRepository.getOne(answerId);
            if (answer.getCorrect()) {
                player.setScore(player.getScore() + 1);
            }
            playerRepository.save(player);
        }
    }

    private Player createPlayer() {
        Player player = new Player();
        String playerName = "Player_" + playerCount;
        playerCount++;
        player.setName(playerName);
        return player;
    }
}
