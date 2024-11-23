package interface_adapter.note;

import use_case.note.Recipe.RecipeOutputBoundary;
import use_case.note.Recipe.RecipeOutputData;
import view.SaveRecipeView;

public class RecipePresenter implements RecipeOutputBoundary {

    private final SaveRecipeView view;

    public RecipePresenter(SaveRecipeView view) {
        this.view = view;
    }
    @Override
    public void prepareSuccessView(RecipeOutputData recipeOutput) {

    }

    @Override
    public void prepareFailView(String sameRecipeError) {

    }
}
