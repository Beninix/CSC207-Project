package interface_adapter.recipe;

import entity.CommonUser;
import entity.Recipe;
import use_case.save_recipe.RecipeInput;
import use_case.save_recipe.RecipeInputBoundary;

public class RecipeControl {
    private final RecipeInputBoundary recipeInputInteracter;

    public RecipeControl(RecipeInputBoundary recipeInputInteractor) {
        this.recipeInputInteracter = recipeInputInteractor;
    }

    public void execute(CommonUser user, Recipe recipe) {
        final RecipeInput recipeInputData = new RecipeInput(user, recipe);
        recipeInputInteracter.execute(recipeInputData);
    }
}
