package com.informatorio.Ejercicio7.repository;

import com.informatorio.Ejercicio7.entity.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
