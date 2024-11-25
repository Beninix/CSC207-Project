package use_case.save_recipe;

public interface RecipeOutputBoundary {
    void prepareSuccessView(RecipeOutputData recipeOutput);

    void prepareFailView(String sameRecipeError);
}
