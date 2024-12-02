
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
        System.out.println(this.name);
        System.out.println(this.ingredients);
        System.out.println(this.instructions);
        System.out.println(this.cookingTime);
        System.out.println(this.diets);
        this.nutrition.printNutrition();
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
