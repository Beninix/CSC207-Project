package interface_adapter.recipeCollection;

import use_case.recipeCollection.RecipeCollectionInputBoundary;
import use_case.recipeCollection.RecipeCollectionInputData;

/**
 * Controller for the Recipe Collection Use Case.
 */
public class RecipeCollectionController {

    private final RecipeCollectionInputBoundary recipeCollectionUseCaseInteractor;

    public RecipeCollectionController(RecipeCollectionInputBoundary recipeCollectionUseCaseInteractor) {
        this.recipeCollectionUseCaseInteractor = recipeCollectionUseCaseInteractor;
    }

    /**
     * Executes the Recipe Collection Use Case.
     */
    public void execute() {
        recipeCollectionUseCaseInteractor.execute();
    }
}
