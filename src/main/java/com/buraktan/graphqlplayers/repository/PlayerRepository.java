package com.buraktan.graphqlplayers.repository;

import com.buraktan.graphqlplayers.entity.BasketballPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<BasketballPlayer, Long> {
}
