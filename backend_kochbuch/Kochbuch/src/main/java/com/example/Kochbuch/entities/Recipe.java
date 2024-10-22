package com.example.Kochbuch.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String name;
    @NotBlank
    private String description;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<RecipeIngredients> ingredients = new ArrayList<>();

    public List<RecipeIngredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<RecipeIngredients> ingredients) {
        this.ingredients = ingredients;
    }

    public long getId() {
        return id;
    }

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @NotBlank String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank String description) {
        this.description = description;
    }

}
