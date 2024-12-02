package use_case.recipeCollection;

import java.util.List;

import entity.Recipe;

/**
 * The Recipe Collection interactor.
 */
public class RecipeCollectionInteractor implements RecipeCollectionInputBoundary {

    private RecipeCollectionDataAccessInterface recipeCollectionDataAccessObject;
    private RecipeCollectionOutputBoundary recipeCollectionPresenter;

    public RecipeCollectionInteractor(RecipeCollectionDataAccessInterface recipeCollectionDataAccessInterface,
                            RecipeCollectionOutputBoundary recipeCollectionOutputBoundary) {
        this.recipeCollectionDataAccessObject = recipeCollectionDataAccessInterface;
        this.recipeCollectionPresenter = recipeCollectionOutputBoundary;
    }

    /**
     * Executes the Recipe Collection use case.
     */
    @Override
    public void execute() {
        final List<Recipe> recipeList = recipeCollectionDataAccessObject.getCurrentUserRecipeCollection();

        final RecipeCollectionOutputData recipeCollectionOutputData = new RecipeCollectionOutputData(recipeList,
                false);

        this.recipeCollectionPresenter.prepareSuccessView(recipeCollectionOutputData);
    }
}
