package data_access;

import entity.Recipe;
import entity.User;
import use_case.save_recipe.RecipeDataAccessInterface;

/**
 * In-memory implementation of the DAO for storing user data. This implementation does
 * NOT persist data between runs of the program.
 */
public class InMemoryRecipeDAO implements RecipeDataAccessInterface {
    private User user;
    private Recipe recipe;

    public InMemoryRecipeDAO(User user, Recipe recipe) {
        this.user = user;
        this.recipe = recipe;
    }

    @Override
    public boolean existsByName(String recipeName) {
        for (int i = 0; i < user.getRecipeCollection().size(); i++ ) {
            if (user.getRecipeCollection().get(i).getName().equals(recipeName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void save(Recipe recipe) {
        user.addRecipe(recipe);
    }

    @Override
    public Recipe findByName(String recipeName) {
        return null;
    }
}
