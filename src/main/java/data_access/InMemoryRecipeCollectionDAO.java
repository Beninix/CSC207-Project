package data_access;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.Recipe;
import use_case.recipeCollection.RecipeCollectionDataAccessInterface;

/**
 * In-memory implementation of the DAO for storing user's recipe collection. This implementation does
 * NOT persist data between runs of the program.
 */
public class InMemoryRecipeCollectionDAO implements RecipeCollectionDataAccessInterface {

    // making mock data
    private final List<Recipe> allRecipes = new ArrayList<>();

    /**
     * Returns the recipe collection of the current user.
     */
    @Override
    public List<Recipe> getCurrentUserRecipeCollection() {

        for (int i = 0; i < 7; i++) {
            final String name;
            final String instructions;

            switch (i) {
                case 0:
                    name = "Sandwich";
                    instructions = "Spread peanut butter on one slice of bread.";
                    break;
                case 1:
                    name = "Salad";
                    instructions = "Toss mixed greens with olive oil and vinegar.";
                    break;
                case 2:
                    name = "Pasta";
                    instructions = "Boil water, cook pasta, and add sauce.";
                    break;
                // Add more cases for different recipes
                default:
                    name = "Sandwich";
                    instructions = "Spread peanut butter on one slice of bread.";
            }

            List<String> ingredients = List.of("ingredient1", "ingredient2");
            int cookingTime = 5;

            Map<String, Boolean> diets = new HashMap<>();
            diets.put("vegan", true);
            diets.put("vegetarian", true);
            diets.put("glutenFree", false);
            diets.put("dairyFree", true);

            allRecipes.add(new Recipe(name, ingredients, instructions, cookingTime, diets, null));
        }
        return allRecipes;
    }
}
