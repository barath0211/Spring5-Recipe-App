package barath.springframework.spring5recipeapp.services;

import barath.springframework.spring5recipeapp.commands.RecipeCommand;
import barath.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);
}
