package use_case.note.Recipe;
import entity.Recipe;
import entity.User;


public interface RecipeDataAccessInterface {
    /**
     * Checks if the recipe exists.
     * @param recipeName
     * @return true if recipe name does exist; false otherwise
     */
    boolean existsByName(String recipeName);

    /**
     * Saves the recipe into user's bookmarks
     * @param recipe
     */
    void save(Recipe recipe);

}
