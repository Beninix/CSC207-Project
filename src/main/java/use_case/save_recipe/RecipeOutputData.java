package use_case.save_recipe;

import entity.Recipe;

public class RecipeOutputData {
    private final Recipe recipe;
    private final boolean useCaseFailed;

    public RecipeOutputData(Recipe recipe, boolean useCaseFailed) {
        this.recipe = recipe;
        this.useCaseFailed = useCaseFailed;
    }

    public String getRecipeName() {
        return recipe.getName();
    }

    public Recipe getRecipe() {
        return recipe;
    }

}
