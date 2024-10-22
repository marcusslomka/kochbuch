package com.example.Kochbuch.dtos;

import com.example.Kochbuch.entities.RecipeIngredients;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record ReqCreateNewRecipe(
        @NotBlank
        String name,
        @NotBlank
        String description,
        @NotBlank
        List<RecipeIngredients> ingredients
) {

}

