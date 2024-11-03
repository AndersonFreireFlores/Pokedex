package com.example.pokedex.Controllers;

import com.example.pokedex.Service.PokemonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/pokemon")
    public void getAllPokemon() {
        pokemonService.getAllPokemons();
    }

    @GetMapping("/pokemon/{id}")
    public void getPokemonById(@PathVariable int id) {
        pokemonService.getPokemonById(id);
    }

}
