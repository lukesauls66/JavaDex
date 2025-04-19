package com.example.pokedex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pokedex.repository.PokemonRepository;
import com.example.pokedex.model.Pokemon;
import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public void addPokemon(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }
}
