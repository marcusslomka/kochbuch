package com.example.Kochbuch.services;

import com.example.Kochbuch.dtos.ReqCreateNewRecipe;
import com.example.Kochbuch.dtos.RespCreateNewRecipe;
import com.example.Kochbuch.entities.Recipe;
import com.example.Kochbuch.entities.RecipeIngredients;
import com.example.Kochbuch.repositories.RecipeRepository;
import org.springframework.data.repository.core.RepositoryCreationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public RespCreateNewRecipe createNewRecipe(ReqCreateNewRecipe dto){
        Recipe recipe = new Recipe();
        recipe.setName(dto.name());
        recipe.setDescription(dto.description());
        recipe.setIngredients(dto.ingredients());
        this.recipeRepository.save(recipe);
        return new RespCreateNewRecipe(dto.name());
    }

    public Optional<Recipe> getRecipeByID(long id){
        Optional<Recipe> toGetRecipe = recipeRepository.findById(id);
        if (toGetRecipe.isEmpty()){
            throw new IllegalArgumentException("No Recipe with this ID found");
        }
        else {
            return toGetRecipe;
        }
    }


}
