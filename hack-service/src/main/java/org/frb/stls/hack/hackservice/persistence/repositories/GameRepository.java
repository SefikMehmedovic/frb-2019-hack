package org.frb.stls.hack.hackservice.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.frb.stls.hack.hackservice.persistence.entiy.Game;

import javax.inject.Named;

@Named
public interface GameRepository extends JpaRepository<Game, Integer> {
}
