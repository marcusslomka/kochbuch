package com.example.Kochbuch.entities;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
public class RecipeIngredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    @OneToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    private int amount;
}
