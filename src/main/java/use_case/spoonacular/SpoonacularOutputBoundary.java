package use_case.spoonacular;

public abstract class SpoonacularOutputBoundary {
    public abstract void prepareSuccessView(SpoonacularOutputData spoonacularOutput) throws DataAccessException;

    public abstract void prepareFailView(String noRecipesError);
}
