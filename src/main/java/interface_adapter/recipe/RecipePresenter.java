package interface_adapter.recipe;

import interface_adapter.ViewManagerModel;
import use_case.save_recipe.RecipeOutputBoundary;
import use_case.save_recipe.RecipeOutputData;
import view.RecipeView;

public class RecipePresenter implements RecipeOutputBoundary {

    private final RecipeView view;
    private final RecipeViewModel recipeViewModel;
    private final ViewManagerModel viewManagerModel;

    public RecipePresenter(RecipeView view, RecipeViewModel recipeViewModel, ViewManagerModel viewManagerModel
    , ViewManagerModel viewManager) {
        this.view = view;
        this.recipeViewModel = recipeViewModel;
        this.viewManagerModel = viewManagerModel;
    }
    @Override
    public void prepareSuccessView(RecipeOutputData recipeOutput) {
        final RecipeState recipeState = recipeViewModel.getState();
        recipeState.setRecipe(recipeOutput.getRecipe());
        this.recipeViewModel.setState(recipeState);
        this.recipeViewModel.firePropertyChanged();

        this.viewManagerModel.setState(recipeViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String sameRecipeError) {
        final  RecipeState recipeState = recipeViewModel.getState();
        recipeState.setRecipeError(sameRecipeError);
        recipeViewModel.firePropertyChanged();

    }
}
