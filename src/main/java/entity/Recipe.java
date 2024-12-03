
package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class for Recipe entity.
 */

public class Recipe {

    private String name;
    private List<String> ingredients = new ArrayList<String>();
    private String instructions;
    private int cookingTime;
    private Map<String, Boolean> diets = new HashMap<String, Boolean>();
    private Nutrition nutrition;

    public Recipe(String name, List<String> ingredients, String instructions,
                  int cookingTime, Map<String, Boolean> diets, Nutrition nutrition) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.cookingTime = cookingTime;
        this.diets = diets;
        this.nutrition = nutrition;
    }

    /**
     * Prints out recipe and its details fully in logical order.
     */

    public void printRecipe() {
        System.out.println("Name:" + this.name);
        System.out.println("Ingredients: " + this.ingredients);
        System.out.println("Instructions: " + this.instructions);
        System.out.println("Cooking Time: " + this.cookingTime);
        System.out.println("Diets: " + this.diets);
        this.nutrition.printNutrition();
    }

    public String[] getColumns() {
        String [] output = {
                "Name",
                "Ingredients",
                "Instructions",
                "Cooking Time",
                "Diets",
                "Calories",
                "Protein",
                "Sugar",
                "Fiber",
                "Sodium",
                "Cholesterol",
                "Fat"
        };
        return output;
    }

    public String[] toRow(){
        String [] output = {this.name,
                this.ingredients.toString(),
                this.instructions,
                String.valueOf(this.cookingTime),
                this.diets.toString(),
                String.valueOf(this.nutrition.getCalories()),
                String.valueOf(this.nutrition.getProtein()),
                String.valueOf(this.nutrition.getSugar()),
                String.valueOf(this.nutrition.getFiber()),
                String.valueOf(this.nutrition.getSodium()),
                String.valueOf(this.nutrition.getCholesterol()),
                String.valueOf(this.nutrition.getFat())
                };
        return output;
    }

    /**
     * Retrieves name of Recipe.
     * @return returns name of Recipe.
     */

    public String getName() {
        return name;
    }

    /**
     * Retrieves Recipe's nutritional facts.
     * @return nutritional facts of recipe.
     */
    public Nutrition getNutrition() {
        return nutrition;
    }

    /**
     * Retrieves dietary restrictions the recipe adheres to.
     * @return dietary restrictions the recipe adheres to through a map and a boolean.
     */

    public Map<String, Boolean> getDiets() {
        return diets;
    }

    /**
     * Retrieves cooking duration of recipe.
     * @return cooking duration of recipe in an int that represents minutes.
     */

    public int getCookingTime() {
        return cookingTime;
    }

    /**
     * Retrieves instructions of recipe.
     * @return instructions of recipe.
     */

    public String getInstructions() {
        return instructions;
    }

    /**
     * Retrieves total calories of the recipe.
     * @return total calories of recipe.
     */

    public int getTotalCalories() {
        return nutrition.getCalories();
    }

    /**
     * Retrieves ingredients of recipe.
     * @return a list of ingredients of the recipe.
     */
    public List<String> getIngredients() {
        return ingredients;
    }

}
