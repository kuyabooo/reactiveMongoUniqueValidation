package com.unique.demo.repository;

import com.unique.demo.entity.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<UserEntity, String> {

}
