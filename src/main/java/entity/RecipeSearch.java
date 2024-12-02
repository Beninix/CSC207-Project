package entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Class that handles all responsibility for searching a recipe. This handles filters
 * including dietary restrictions, ingredients, and cooking duration.
 */
public class RecipeSearch {
    /**
     * Filters and searches for recipes through dietary restrictions.
     * @param recipeList list of recipes that has been populated by the API call.
     * @param diets the filters of dietary restrictions that have been enabled on or off through boolean by the user.
     * @return the list of recipes that adhere to the dietary restriction(s).
     */
    public static List<Recipe> dietSearch(List<Recipe> recipeList, Map<String, Boolean> diets) {
        List<Recipe> output = new ArrayList<Recipe>();
        for (Recipe r : recipeList) {
            Boolean invalid = false;
            for (Map.Entry<String, Boolean> entry : diets.entrySet()) {
                if (entry.getValue() != r.getDiets().get(entry.getKey())) {
                    invalid = true;
                    break;
                }
            }
            if (!invalid) {
                output.add(r);
            }
        }
        return output;
    }
    /**
     * Searches and filters for recipes through specific ingredients.
     * @param recipeList list of recipes that has been populated by the API call.
     * @param ingredients list of ingredients that are enabled by the user to must be included when searching for
     *                    recipes.
     * @return the list of recipes that adhere to the ingredients restrictions.
     */

    public static List<Recipe> ingredientsSearch(List<Recipe> recipeList, List<String> ingredients) {
        List<Recipe> output = new ArrayList<>();
        for (Recipe r : recipeList) {
            if (new HashSet<>(r.getIngredients()).containsAll(ingredients)) {
                output.add(r);
            }
        }
        return output;
    }
    /**
     * Searches and filters for recipes through maximum calories the user inputs.
     * @param recipeList list of recipes that has been populated by the API call.
     * @param maxCalories the maximum calorie restriction the user inputs that the recipe must adhere to.
     * @return the list of recipes that adhere to the maximum calorie restriction.
     */

    public static List<Recipe> caloriesSearch(List<Recipe> recipeList, int maxCalories) {
        List<Recipe> output = new ArrayList<Recipe>();
        for (Recipe r : recipeList) {
            if (r.getNutrition().getCalories() <= maxCalories) {
                output.add(r);
            }
        }
        return output;
    }
    /**
     * Searches and filters for recipes through the maximum cooking duration the user inputs.
     * @param recipeList list of recipes that has been populated by the API call.
     * @param maxCookingTimes the maximum cooking duration the user inputs that the recipe must adhere to.
     * @return the list of recipes that adhere to the maximum cooking duration restriction.
     */

    public static List<Recipe> cookingTimeSearch(List<Recipe> recipeList, int maxCookingTimes) {
        List<Recipe> output = new ArrayList<Recipe>();
        for (Recipe r : recipeList) {
            if (r.getCookingTime() <= maxCookingTimes) {
                output.add(r);
            }
        }
        return output;
    }

}
