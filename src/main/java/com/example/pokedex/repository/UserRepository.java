package com.example.pokedex.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.pokedex.model.User;

public interface UserRepository extends MongoRepository<User, String> {}
