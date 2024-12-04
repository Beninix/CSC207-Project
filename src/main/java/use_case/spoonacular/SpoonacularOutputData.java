package use_case.spoonacular;

import entity.Recipe;

import java.util.List;

public class SpoonacularOutputData {
    private final List<Recipe> recipes;
    private final boolean useCaseFailed;

    public SpoonacularOutputData(List<Recipe> recipes, boolean useCaseFailed) {
        this.recipes = recipes;
        this.useCaseFailed = useCaseFailed;
    }

    public List<Recipe> getRecipes() {
        return this.recipes;
    }
}
