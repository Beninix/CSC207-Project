package use_case.recipeCollection;

import entity.Recipe;

import java.util.List;

/**
 * Output data for the Recipe Collection use case.
 */
public class RecipeCollectionOutputData {

    private List<Recipe> recipeCollection;
    private List<String> recipeCollectionString;
    private final boolean useCaseFailed;

    public RecipeCollectionOutputData(List<Recipe> recipeCollection, boolean useCaseFailed) {
        this.recipeCollection = recipeCollection;
        this.useCaseFailed = useCaseFailed;
    }

    /**
     * Returns list of recipe names in the current user's recipe collection.
     * @return list of strings
     */
    public List<String> getRecipeCollection() {
        for (Recipe recipe : recipeCollection) {
            recipeCollectionString.add(recipe.getName());
        }
        return recipeCollectionString;
    }

    public boolean isUseCaseFailed() {
        return useCaseFailed;
    }
}
