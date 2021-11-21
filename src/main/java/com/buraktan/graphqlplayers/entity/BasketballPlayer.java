package com.buraktan.graphqlplayers.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "BasketballPlayers")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BasketballPlayer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100, name = "Name")
    private String name;

    @Column(length = 100, name = "SurName")
    private String surName;

    @Column(length = 100, name = "Position")
    private String position;

    @Column(name = "createDate")
    private Date createAt;

}
