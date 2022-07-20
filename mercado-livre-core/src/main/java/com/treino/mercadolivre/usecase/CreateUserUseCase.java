package com.treino.mercadolivre.usecase;

import com.treino.mercadolivre.gateway.CreateUserGateway;
import com.treino.mercadolivre.model.UserDomain;
import com.treino.mercadolivre.model.dto.CreateUserIn;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.treino.mercadolivre.util.EncryptorPasswordUtil.encryptorPassword;

@Service
@RequiredArgsConstructor
public class CreateUserUseCase {

    private final CreateUserGateway createUserGateway;

    public void execute(CreateUserIn createUserIn) {
        createUserGateway.execute(UserDomain.builder()
                .login(createUserIn.getLogin())
                .password(encryptorPassword(createUserIn.getPassword()))
                .createdAt(LocalDateTime.now())
                .build());
    }
}