package interface_adapter.note;

import use_case.note.Recipe.RecipeOutputBoundary;
import use_case.note.Recipe.RecipeOutputData;

public class RecipePresenter implements RecipeOutputBoundary {

    private final RecipeView view;

    public RecipePresenter(RecipeView view) {
        this.view = view;
    }
    @Override
    public void prepareSuccessView(RecipeOutputData recipeOutput) {
        final

    }

    @Override
    public void prepareFailView(String sameRecipeError) {

    }
}
