package org.frb.stls.hack.hackservice.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.frb.stls.hack.hackservice.persistence.entiy.Answer;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> findAnswersByQuestionId(Integer questionId);
}
