package data_access;

import entity.Recipe;
import use_case.save_recipe.RecipeDataAccessInterface;
import entity.CommonUser;

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
    private final List<Recipe> recipeStorage;

    public RecipeDataAccessObject() {
        this.recipeStorage = new ArrayList<>();
    }

    @Override
    public boolean existsByName(String recipeName) {
        return recipeStorage.stream().anyMatch(recipe -> recipe.getName().equals(recipeName));
    }

    @Override
    public void save(Recipe recipe) {
        if (!existsByName(recipe.getName())) {
            recipeStorage.add(recipe);
        } else {
            throw new IllegalArgumentException("Recipe with the same name already exists.");
        }
    }

    @Override
    public Recipe findByName(String recipeName) {
        return recipeStorage.stream()
                .filter(recipe -> recipe.getName().equals(recipeName))
                .findFirst()
                .orElse(null);
    }
}
