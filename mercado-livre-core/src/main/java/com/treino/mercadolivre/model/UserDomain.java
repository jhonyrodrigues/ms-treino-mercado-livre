package com.treino.mercadolivre.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
@Document("user")
public class UserDomain {

    @Id
    private final String id = UUID.randomUUID().toString();

    private String login;

    private String password;

    private LocalDateTime createdAt;

}