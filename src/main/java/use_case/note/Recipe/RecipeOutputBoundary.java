package use_case.note.Recipe;

public interface RecipeOutputBoundary {
    void prepareSuccessView(RecipeOutputData recipeOutput);

    void prepareFailView(String sameRecipeError);
}
