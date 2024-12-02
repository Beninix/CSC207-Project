package interface_adapter.recipeCollection;

import java.util.List;

/**
 * The state information for the user's Recipe Collection.
 */
public class RecipeCollectionState {

    private List<String> recipeList;

    public void setRecipeList(List<String> recipeList) {
        this.recipeList = recipeList;
    }

    public List<String> getRecipeList() {
        return recipeList;
    }
}
