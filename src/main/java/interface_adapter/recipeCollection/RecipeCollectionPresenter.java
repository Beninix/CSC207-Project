package interface_adapter.recipeCollection;

import interface_adapter.ViewManagerModel;
import use_case.recipeCollection.RecipeCollectionOutputBoundary;
import use_case.recipeCollection.RecipeCollectionOutputData;

/**
 * The Presenter for the Recipe Collection Use Case.
 */
public class RecipeCollectionPresenter implements RecipeCollectionOutputBoundary {

    private final RecipeCollectionViewModel recipeCollectionViewModel;
    private final ViewManagerModel viewManagerModel;

    public RecipeCollectionPresenter(ViewManagerModel viewManagerModel,
                                     RecipeCollectionViewModel recipeCollectionViewModel) {

        this.viewManagerModel = viewManagerModel;
        this.recipeCollectionViewModel = recipeCollectionViewModel;
    }

    /**
     * Prepares the success view for the Recipe Collection use case.
     *
     * @param recipeCollectionOutputData the output data
     */
    @Override
    public void prepareSuccessView(RecipeCollectionOutputData recipeCollectionOutputData) {
        // On success, switch to the recipe collection view.
        final RecipeCollectionState recipeCollectionState = recipeCollectionViewModel.getState();

        recipeCollectionState.setRecipeList(recipeCollectionOutputData.getRecipeCollection());
        this.recipeCollectionViewModel.setState(recipeCollectionState);
        this.recipeCollectionViewModel.firePropertyChanged();

        this.viewManagerModel.setState(recipeCollectionViewModel.getViewName());
        this.viewManagerModel.firePropertyChanged();
    }

    /**
     * Prepares the failure view for the Recipe Collection use case.
     *
     * @param errorMessage the explanation of the failure
     */
    @Override
    public void prepareFailView(String errorMessage) {
        // not yet implemented
    }
}
