package com.example.Kochbuch.repositories;

import com.example.Kochbuch.entities.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient,Long> {
    Optional<Ingredient>findByName(String name);
}
