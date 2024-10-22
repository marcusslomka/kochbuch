package com.example.Kochbuch.controllers;

import com.example.Kochbuch.dtos.ReqCreateNewRecipe;
import com.example.Kochbuch.dtos.RespCreateNewRecipe;
import com.example.Kochbuch.entities.RecipeIngredients;
import com.example.Kochbuch.services.RecipeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/kochbuch/recipe")
public class RecipeController {
    RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @PostMapping
    public ResponseEntity<RespCreateNewRecipe> createNewRecipe(@RequestBody @Validated ReqCreateNewRecipe dto){

        return ResponseEntity.status(HttpStatus.CREATED).body(recipeService.createNewRecipe(dto));

    }
}
