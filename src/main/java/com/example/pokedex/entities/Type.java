package com.example.pokedex.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Type {

    @Id
    private int id;

    private String name;



    public Type() {}

    public Type(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}