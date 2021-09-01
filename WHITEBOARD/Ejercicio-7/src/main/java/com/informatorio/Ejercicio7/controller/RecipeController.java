package com.informatorio.Ejercicio7.controller;

import com.informatorio.Ejercicio7.entity.Recipe;
import com.informatorio.Ejercicio7.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class RecipeController {

    @Autowired
    private RecipeRepository repository;

    @RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public Recipe createProduct(@RequestBody Recipe recipe){
        return repository.save(recipe);
    }

    //Pedir receta por id
    @RequestMapping(value = "/recipe/{id}" , method = RequestMethod.GET)
    public Recipe getRecipeById(@PathVariable("id") Long id){
        return repository.findById(id).get();
    }

    @RequestMapping(value = "/recipe" , method = RequestMethod.GET)
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/recipe/{id}" , method = RequestMethod.PUT)
    public Recipe modifyProducts(@PathVariable("id") Long id , @Valid @RequestBody Recipe recipe){
        Recipe recipeExist = repository.findById(id).get();
        recipeExist.setDescription(recipe.getDescription());
        return repository.save(recipeExist);
    }

    @RequestMapping(value = "/recipe/{id}" , method = RequestMethod.DELETE)
    public void deleteId(@PathVariable("id") Long id){
        repository.deleteById(id);
    }
}
