
package com.example.pokedex.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private float height;
    private float weight;
    private boolean gender;
    private String category;
    private String abilities;

    @ManyToMany
    @JoinTable(
        name = "pokemon_type",
        joinColumns = @JoinColumn(name = "pokemon_id"),
        inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    private List<Type> types;

    // Constructors, getters, and setters
    public Pokemon() {}

    // other getters and setters

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }
}

