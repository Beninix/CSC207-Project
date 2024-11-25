package interface_adapter.recipe;

import entity.Recipe;
import use_case.save_recipe.RecipeInput;
import use_case.save_recipe.RecipeInputBoundary;

public class RecipeControl {
    private final RecipeInputBoundary recipeInputInteracter;

    public RecipeControl(RecipeInputBoundary recipeInputInteractor) {
        this.recipeInputInteracter = recipeInputInteractor;
    }

    public void execute(Recipe recipe) {
        final RecipeInput recipeInputData = new RecipeInput(recipe);
        recipeInputInteracter.execute(recipeInputData);
    }
}


