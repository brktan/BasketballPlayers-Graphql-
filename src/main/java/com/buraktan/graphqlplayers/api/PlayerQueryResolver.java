package com.buraktan.graphqlplayers.api;

import com.buraktan.graphqlplayers.entity.BasketballPlayer;
import com.buraktan.graphqlplayers.repository.PlayerRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlayerQueryResolver implements GraphQLQueryResolver {

    private final PlayerRepository playerRepository;

    public List<BasketballPlayer> getAllPlayers() {
        System.out.println(playerRepository.findAll());
        return playerRepository.findAll();
    }


}
