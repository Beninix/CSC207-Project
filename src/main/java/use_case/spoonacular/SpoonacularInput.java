package use_case.spoonacular;

import data_access.DBSpoonacularDataAccessObject;
import entity.Recipe;

import java.util.List;
import java.util.Map;

public class SpoonacularInput {
    private Map<String, Boolean> diets;
    private List<String> ingredients;
    private int calories;
    private int cookingTime;
    private final DBSpoonacularDataAccessObject dbSpoonacularDataAccessObject;
    public SpoonacularInput(Map<String, Boolean> diets, List<String> ingredients, int calories, int cookingTime, DBSpoonacularDataAccessObject dbSpoonacularDataAccessObject) {
        this.diets = diets;
        this.ingredients = ingredients;
        this.calories = calories;
        this.cookingTime = cookingTime;
        this.dbSpoonacularDataAccessObject = dbSpoonacularDataAccessObject;
    }
    public List<String> getIngredients() {
        return ingredients;
    }

    public Map<String, Boolean> getDiets() {
        return diets;
    }

    public int getCalories() {
        return calories;
    }

    public int getCookingTime() {
        return cookingTime;
    }
    public DBSpoonacularDataAccessObject getDbSpoonacularDataAccessObject() {return dbSpoonacularDataAccessObject;}
}
