package com.treino.mercadolivre.repository;

import com.treino.mercadolivre.model.UserDomain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMongoRepository extends MongoRepository<UserDomain, String> {
}
