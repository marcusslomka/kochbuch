package com.example.Kochbuch.dtos;

import jakarta.validation.constraints.NotBlank;

public record RespCreateNewRecipe (
        @NotBlank
        String name
){
}
