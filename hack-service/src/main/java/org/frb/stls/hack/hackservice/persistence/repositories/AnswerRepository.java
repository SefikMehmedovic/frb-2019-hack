package org.frb.stls.hack.hackservice.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.frb.stls.hack.hackservice.persistence.entiy.Answer;

import javax.inject.Named;
import java.util.List;

@Named
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> findAnswersByQuestionId(Integer questionId);
}
