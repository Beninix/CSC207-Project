package use_case.recipeCollection;

import java.util.List;

import entity.Recipe;

/**
 * DAO for the Recipe Collection use case.
 */
public interface RecipeCollectionDataAccessInterface {

    /**
     * Returns the recipe collection of the current user.
     */
    List<Recipe> getCurrentUserRecipeCollection();
}
