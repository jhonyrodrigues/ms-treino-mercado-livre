package com.treino.mercadolivre.gateway;

import com.treino.mercadolivre.repository.UserMongoRepository;
import com.treino.mercadolivre.model.UserDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserGatewayImpl implements CreateUserGateway {

    private final UserMongoRepository userMongoRepository;

    @Override
    public void execute(UserDomain userDomain) {
        userMongoRepository.save(userDomain);
    }

}