package use_case.spoonacular;

import data_access.DBSpoonacularDataAccessObject;
import entity.Recipe;

import java.util.List;
import java.util.Map;

public class SpoonacularInteractor implements SpoonacularInputBoundary{
    private final SpoonacularDataAccessInterface spoonacularDataAccessObject;
    private final SpoonacularOutputBoundary spoonacularOutputBoundary;
    public SpoonacularInteractor(SpoonacularDataAccessInterface spoonacularDataAccessObject, SpoonacularOutputBoundary spoonacularOutputBoundary) {
        this.spoonacularDataAccessObject = spoonacularDataAccessObject;
        this.spoonacularOutputBoundary = spoonacularOutputBoundary;
    }
    public void execute(SpoonacularInput spoonacularInput) throws DataAccessException {
        Map<String, Boolean> diets = spoonacularInput.getDiets();
        List<String> ingredients = spoonacularInput.getIngredients();
        int calories = spoonacularInput.getCalories();
        int cookingTime = spoonacularInput.getCookingTime();
        final DBSpoonacularDataAccessObject dbSpoonacularDataAccessObject = spoonacularInput.getDbSpoonacularDataAccessObject();
        List<Recipe> recipes = dbSpoonacularDataAccessObject.loadRecipes(diets,ingredients,calories,cookingTime);
        if(!recipes.isEmpty()) {
            spoonacularOutputBoundary.prepareSuccessView(new SpoonacularOutputData(recipes,false));
        }
        else {
            spoonacularOutputBoundary.prepareFailView("Recipe search failed.");
        }
    }
}