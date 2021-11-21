package com.buraktan.graphqlplayers.converter;

import com.buraktan.graphqlplayers.dto.PlayersDto;
import com.buraktan.graphqlplayers.entity.BasketballPlayer;

import java.util.Date;

public class PlayerConverter {

    public BasketballPlayer dtoToEntity(PlayersDto playersDto) {

        BasketballPlayer basketballPlayer = BasketballPlayer.builder()
                .name(playersDto.getName())
                .surName(playersDto.getSurName())
                .position(playersDto.getPosition())
                .createAt(new Date())
                .build();

        return basketballPlayer;
    }
}
