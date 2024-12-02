package interface_adapter.recipeCollection;

import data_access.InMemoryRecipeCollectionDAO;
import org.junit.jupiter.api.Test;
import use_case.recipeCollection.RecipeCollectionInteractor;
import use_case.recipeCollection.RecipeCollectionOutputBoundary;
import use_case.recipeCollection.RecipeCollectionOutputData;

import static org.junit.jupiter.api.Assertions.*;

class RecipeCollectionPresenterTest {

    @Test
    void prepareSuccessTest() {
        InMemoryRecipeCollectionDAO inMemoryRecipeCollectionDAO = new InMemoryRecipeCollectionDAO();
        RecipeCollectionOutputBoundary recipeCollectionPresenter = new RecipeCollectionOutputBoundary() {
            @Override
            public void prepareSuccessView(RecipeCollectionOutputData recipeCollectionOutputData) {
                assertNotNull(recipeCollectionOutputData);
            }

            @Override
            public void prepareFailView(String errorMessage) {
                fail("No recipes found.");
            }
        };

        RecipeCollectionInteractor interactor = new RecipeCollectionInteractor(inMemoryRecipeCollectionDAO,
                recipeCollectionPresenter);
        interactor.execute();
    }

    @Test
    void prepareFailTest() {
    }
}