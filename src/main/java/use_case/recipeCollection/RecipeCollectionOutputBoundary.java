package use_case.recipeCollection;

import use_case.login.LoginOutputData;

/**
 * The output boundary for the Recipe Collection use case.
 */
public interface RecipeCollectionOutputBoundary {

    /**
     * Prepares the success view for the Recipe Collection use case.
     * @param recipeCollectionOutputData the output data
     */
    void prepareSuccessView(RecipeCollectionOutputData recipeCollectionOutputData);

    /**
     * Prepares the failure view for the Recipe Collection use case.
     * @param errorMessage the explanation of the failure
     */
    void prepareFailView(String errorMessage);

}
