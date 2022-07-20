package com.treino.mercadolivre.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Builder
@AllArgsConstructor
public class CreateUserIn {

    @Email
    @NotBlank
    private String login;

    @NotBlank
    @Size(min = 6)
    private String password;

}