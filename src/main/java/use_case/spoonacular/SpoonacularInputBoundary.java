package use_case.spoonacular;

public interface SpoonacularInputBoundary {
    void execute(SpoonacularInput input) throws DataAccessException;
}
