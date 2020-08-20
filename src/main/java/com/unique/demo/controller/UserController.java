package com.unique.demo.controller;


import com.unique.demo.entity.UserEntity;
import com.unique.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("")
    public Mono<ResponseEntity<?>> create(@RequestBody UserEntity reqBody){

        return userRepository
                .insert(reqBody)
                .map(obj -> new ResponseEntity<>(obj, HttpStatus.CREATED));
    }


    @GetMapping("/all")
    public Flux<UserEntity> getAll(){

        return userRepository
                .findAll();
    }


}
