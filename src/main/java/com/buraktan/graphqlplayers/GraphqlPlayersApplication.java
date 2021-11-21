package com.buraktan.graphqlplayers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class GraphqlPlayersApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlPlayersApplication.class, args);


    }

}
