package com.buraktan.graphqlplayers.api;

import com.buraktan.graphqlplayers.converter.PlayerConverter;
import com.buraktan.graphqlplayers.dto.PlayersDto;
import com.buraktan.graphqlplayers.entity.BasketballPlayer;
import com.buraktan.graphqlplayers.repository.PlayerRepository;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PlayerMutationResolver implements GraphQLMutationResolver {

    private final PlayerRepository playerRepository;
    private PlayerConverter playerConverter = new PlayerConverter();

    public BasketballPlayer saveBasketballPlayer(PlayersDto playersDto) {
        return playerRepository.save(playerConverter.dtoToEntity(playersDto));
    }

    public void deleteBasketballPlayer(Long id) {
        playerRepository.deleteById(id);
    }

}
