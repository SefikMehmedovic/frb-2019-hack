package org.frb.stls.hack.hackservice;

import org.frb.stls.hack.hackservice.persistence.entiy.Answer;
import org.frb.stls.hack.hackservice.persistence.entiy.Question;
import org.frb.stls.hack.hackservice.persistence.repositories.AnswerRepository;
import org.frb.stls.hack.hackservice.persistence.repositories.QuestionRepository;

import javax.inject.Inject;
import java.util.Collections;
import java.util.List;

public class QuestionAnswerService {

    @Inject
    private QuestionRepository questionRepository;
    @Inject
    private AnswerRepository answerRepository;


    public List<Question> getQuestions(Integer questionNUmebrs) {
        List<Question> allQuestions = questionRepository.findAll();

        Collections.shuffle(allQuestions);

        return allQuestions.subList(0, questionNUmebrs);
    }

    public List<Answer> getAnswers(Integer questionId) {
        List<Answer> allAnswers = answerRepository.findAnswersByQuestionId(questionId);
        Collections.shuffle(allAnswers);
        return allAnswers;
    }
}
