package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recipe {


    private String name;
    private List<String> ingredients = new ArrayList<String>();
    private String instructions;
    private int cookingTime;
    private Map<String, Boolean> diets = new HashMap<String, Boolean>();
    private Nutrition nutrition;
    public Recipe(String name, List<String> ingredients, String instructions, int cookingTime, Map<String,Boolean> diets, Nutrition nutrition) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.cookingTime = cookingTime;
        this.diets = diets;
        this.nutrition = nutrition;
    }
    public void printRecipe() {
        System.out.println(this.name);
        System.out.println(this.ingredients);
        System.out.println(this.instructions);
        System.out.println(this.cookingTime);
        System.out.println(this.diets);
        this.nutrition.printNutrition();
    }
    public String getName() {
        return name;
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
        return instructions;
    }

    public int getTotalCalories() {
        return nutrition.getCalories();
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public Recipe getAllDetails() {
        Map<String, Object> details = new HashMap<>();
        details.put("name", name);
        details.put("ingredients", ingredients);
        details.put("instructions", instructions);
        details.put("cookingTime", cookingTime);
        details.put("diets", diets);
        details.put("nutrition", nutrition);
        return (Recipe) details;
        // this is new! and will def cause a merge conflict
    }


}