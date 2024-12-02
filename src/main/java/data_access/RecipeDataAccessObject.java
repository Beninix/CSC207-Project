package data_access;

import entity.Recipe;
import use_case.save_recipe.RecipeDataAccessInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * The DAO for accessing recipes in the database.
 * <p>This class demonstrates how your group can use the password-protected user
 * endpoints of the API used in lab 5 to store persistent data in your program.
 * </p>
 * <p>You can also refer to the lab 5 code for signing up a new user and other use cases.
 * </p>
 * See
 * <a href=
 * "https://www.postman.com/cloudy-astronaut-813156/
 * csc207-grade-apis-demo/documentation/fg3zkjm/5-password-protected-user">
 *     the documentation</a>
 * of the API for more details.
 */
public class RecipeDataAccessObject implements RecipeDataAccessInterface {
    private List<Recipe> recipeStorage;

    public RecipeDataAccessObject(Recipe recipe) {
        this.recipeStorage = new ArrayList<>();
    }

    @Override
    public boolean existsByName(String recipeName) {
        return recipeStorage.stream().anyMatch(recipe -> recipe.getName().equalsIgnoreCase(recipeName));
    }

    @Override
    public Recipe getRecipeName(String recipeName) {
        return null;
    }

    @Override
    public Recipe getRecipe(String recipeName) {
        return recipeStorage.stream()
                .filter(recipe -> recipe.getName().equalsIgnoreCase(recipeName))
                .findFirst()
                .orElse(null);
    }
}
