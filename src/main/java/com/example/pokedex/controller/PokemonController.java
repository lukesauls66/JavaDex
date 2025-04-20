package com.example.pokedex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pokedex.service.PokemonService;
import com.example.pokedex.model.Pokemon;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @PostMapping
    public void addPokemon(@RequestBody Pokemon pokemon) {
        pokemonService.addPokemon(pokemon);
    } 

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }
}
