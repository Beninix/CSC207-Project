package interface_adapter.note;

import entity.Recipe;
import use_case.note.Recipe.RecipeInput;
import use_case.note.Recipe.RecipeInputBoundary;

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


