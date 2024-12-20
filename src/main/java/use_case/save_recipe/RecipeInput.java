package use_case.save_recipe;

import entity.CommonUser;
import entity.Nutrition;
import entity.Recipe;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeInput {
    private Recipe recipe;
    private CommonUser user;

    public RecipeInput(CommonUser user, Recipe recipe) {

        this.recipe = recipe;
        this.user = user;
    }

    public void printRecipe() {
        System.out.println(recipe.getName());
        System.out.println(recipe.getIngredients());
        System.out.println(recipe.getInstructions());
        System.out.println(recipe.getCookingTime());
        System.out.println(recipe.getDiets());
        System.out.println(recipe.getNutrition());
    }

    public Recipe getRecipe(){return recipe;}

    public String getName() {
        return recipe.getName();
    }

    public Nutrition getNutrition() {
        return recipe.getNutrition();
    }

    public Map<String, Boolean> getDiets() {
        return recipe.getDiets();
    }

    public int getCookingTime() {
        return recipe.getCookingTime();
    }

    public String getInstructions() {
        return recipe.getInstructions();
    }

    public int getTotalCalories() {
        return recipe.getTotalCalories();
    }

    public List<String> getIngredients() {
        return recipe.getIngredients();
    }

    public Recipe getAllDetails() {
        Map<String, Object> details = new HashMap<>();
        details.put("name", recipe.getName());
        details.put("ingredients", recipe.getIngredients());
        details.put("instructions", recipe.getInstructions());
        details.put("cookingTime", recipe.getCookingTime());
        details.put("diets", recipe.getDiets());
        details.put("nutrition", recipe.getNutrition());
        return (Recipe) details;
        // this is new! and will def cause a merge conflict
    }

    public CommonUser getUser() {
        return user;
    }

}
