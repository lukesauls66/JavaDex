package com.example.pokedex.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.pokedex.model.Pokemon;

public interface PokemonRepository extends MongoRepository<Pokemon, String> {}
