package com.treino.mercadolivre.gateway;

import com.treino.mercadolivre.model.UserDomain;
import com.treino.mercadolivre.repository.UserMongoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class CreateUserGatewayImplTest {

    @InjectMocks
    private CreateUserGatewayImpl gateway;

    @Mock
    private UserMongoRepository repository;

    private UserDomain userDomain;

    @BeforeEach
    void setup() {
        initUser();
    }

    @Test
    void mustRegisterUserSuccessfully() {
        assertDoesNotThrow(() -> gateway.execute(userDomain));
    }

    private void initUser() {
        userDomain = UserDomain.builder()
                .login("teste@teste.com")
                .password("8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92")
                .createdAt(LocalDateTime.now())
                .build();
    }
}