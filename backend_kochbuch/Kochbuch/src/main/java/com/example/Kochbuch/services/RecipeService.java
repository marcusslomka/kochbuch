package com.example.Kochbuch.services;

import com.example.Kochbuch.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


}
