package data_access;

import entity.Recipe;
import use_case.note.Recipe.RecipeDataAccessInterface;
import entity.User;

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
    private final Recipe recipe;
    private final User user;

    public RecipeDataAccessObject(Recipe recipe, User user) {
        this.recipe = recipe;
        this.user = user;
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

    public String get() {return recipe.getName();}

}
