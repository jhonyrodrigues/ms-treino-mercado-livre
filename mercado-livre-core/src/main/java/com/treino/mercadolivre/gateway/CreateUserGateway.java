package com.treino.mercadolivre.gateway;

import com.treino.mercadolivre.model.UserDomain;

public interface CreateUserGateway {
    void execute(UserDomain userDomain);
}