package entity;

import java.util.ArrayList;

/**
 * The representation of a user in our program.
 */
public interface User {

    /**
     * Returns the username of the user.
     * @return the username of the user.
     */
    String getName();

    /**
     * Returns the password of the user.
     * @return the password of the user.
     */
    String getPassword();

    // Brandon's
    void addRecipe(Recipe recipe);

    // Brandon's
    ArrayList<Recipe> getRecipeCollection();

    // Emily's
    String getRecipe(String recipeName);

}
