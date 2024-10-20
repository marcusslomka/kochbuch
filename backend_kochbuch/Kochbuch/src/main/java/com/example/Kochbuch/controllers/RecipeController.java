package com.example.Kochbuch.controllers;

import com.example.Kochbuch.services.RecipeService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
    RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

}
