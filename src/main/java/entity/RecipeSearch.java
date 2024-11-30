package entity;

import java.util.*;

public class RecipeSearch {
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

    public static List<Recipe> ingredientsSearch(List<Recipe> recipeList, List<String> ingredients) {
        List<Recipe> output = new ArrayList<>();
        for (Recipe r : recipeList) {
            if(new HashSet<>(r.getIngredients()).containsAll(ingredients)) {
                output.add(r);
            }
        }
        return output;
    }

    public static List<Recipe> caloriesSearch(List<Recipe> recipeList, int maxCalories){
        List<Recipe> output = new ArrayList<Recipe>();
        for (Recipe r : recipeList){
            if(r.getNutrition().getCalories() <= maxCalories){
                output.add(r);
            }
        }
        return output;
    }
    public static List<Recipe> cookingTimeSearch(List<Recipe> recipeList, int maxCookingTimes){
        List<Recipe> output = new ArrayList<Recipe>();
        for (Recipe r : recipeList){
            if(r.getCookingTime() <= maxCookingTimes){
                output.add(r);
            }
        }
        return output;
    }

}
