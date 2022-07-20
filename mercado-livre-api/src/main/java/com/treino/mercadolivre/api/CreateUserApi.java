package com.treino.mercadolivre.api;

import com.treino.mercadolivre.model.dto.CreateUserIn;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequestMapping("/v1/user")
public interface CreateUserApi {
    @PostMapping
    @ResponseStatus(CREATED)
    void execute(@Valid @RequestBody CreateUserIn createUserIn);
}
