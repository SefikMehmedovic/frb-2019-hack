package org.frb.stls.hack.hackservice.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.frb.stls.hack.hackservice.persistence.entiy.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
