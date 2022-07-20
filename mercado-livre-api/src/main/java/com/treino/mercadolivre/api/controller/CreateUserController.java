package com.treino.mercadolivre.api.controller;

import com.treino.mercadolivre.api.CreateUserApi;
import com.treino.mercadolivre.model.dto.CreateUserIn;
import com.treino.mercadolivre.usecase.CreateUserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateUserController implements CreateUserApi {

    private final CreateUserUseCase createUserUseCase;

    @Override
    public void execute(CreateUserIn createUserIn) {
        createUserUseCase.execute(createUserIn);
    }

}