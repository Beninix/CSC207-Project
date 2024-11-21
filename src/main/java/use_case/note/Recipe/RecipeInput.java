package use_case.note.Recipe;

import entity.Nutrition;
import entity.Recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeInput {
    private String recipeName;
    private List<String> recipeIngredients = new ArrayList<String>();
    private String recipeInstructions;
    private int cookingTime;
    private Map<String, Boolean> diets = new HashMap<String, Boolean>();
    private Nutrition nutrition;

    public RecipeInput(String recipeName, List<String> recipeIngredients, String recipeInstructions, int cookingTime, Map<String,Boolean> diets, Nutrition nutrition) {
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.recipeInstructions = recipeInstructions;
        this.cookingTime = cookingTime;
        this.diets = diets;
        this.nutrition = nutrition;
    }

    public void printRecipe() {
        System.out.println(this.recipeName);
        System.out.println(this.recipeIngredients);
        System.out.println(this.recipeInstructions);
        System.out.println(this.cookingTime);
        System.out.println(this.diets);
        this.nutrition.printNutrition();
    }

    public String getName() {
        return recipeName;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public Map<String, Boolean> getDiets() {
        return diets;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getInstructions() {
        return recipeInstructions;
    }

    public int getTotalCalories() {
        return nutrition.getCalories();
    }

    public List<String> getIngredients() {
        return recipeIngredients;
    }

    public Recipe getAllDetails() {
        Map<String, Object> details = new HashMap<>();
        details.put("name", recipeName);
        details.put("ingredients", recipeIngredients);
        details.put("instructions", recipeInstructions);
        details.put("cookingTime", cookingTime);
        details.put("diets", diets);
        details.put("nutrition", nutrition);
        return (Recipe) details;
        // this is new! and will def cause a merge conflict
    }

}
