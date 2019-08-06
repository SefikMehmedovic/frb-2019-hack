package org.frb.stls.hack.hackservice.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.frb.stls.hack.hackservice.persistence.entiy.Question;

import javax.inject.Named;

@Named
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
