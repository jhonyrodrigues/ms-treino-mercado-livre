package com.treino.mercadolivre.usecase;

import com.treino.mercadolivre.gateway.CreateUserGateway;
import com.treino.mercadolivre.model.dto.CreateUserIn;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class CreateUserUseCaseTest {

    @InjectMocks
    private CreateUserUseCase userUseCase;

    @Mock
    private CreateUserGateway gateway;

    private CreateUserIn userIn;

    @BeforeEach
    void setup() {
        initUser();
    }

    @Test
    void mustRegisterUserSuccessfully() {
        assertDoesNotThrow(() -> userUseCase.execute(userIn));
    }

    private void initUser() {
        userIn = CreateUserIn.builder()
                .login("teste@teste.com")
                .password("8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92")
                .build();
    }
}