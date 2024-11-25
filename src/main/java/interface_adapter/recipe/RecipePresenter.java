package interface_adapter.recipe;

import use_case.save_recipe.RecipeOutputBoundary;
import use_case.save_recipe.RecipeOutputData;
import view.RecipeView;

public class RecipePresenter implements RecipeOutputBoundary {

    private final RecipeView view;

    public RecipePresenter(RecipeView view) {
        this.view = view;
    }
    @Override
    public void prepareSuccessView(RecipeOutputData recipeOutput) {

    }

    @Override
    public void prepareFailView(String sameRecipeError) {

    }
}
