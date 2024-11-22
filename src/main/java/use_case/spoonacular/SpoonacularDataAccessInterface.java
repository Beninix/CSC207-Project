package use_case.spoonacular;

import entity.Recipe;
import use_case.note.DataAccessException;

import java.util.List;
import java.util.Map;

/**
 * Interface for the NoteDAO. It consists of methods for
 * both loading and saving a note.
 */
public interface SpoonacularDataAccessInterface {
        /**
         * Returns list of found recipes
         * @param diets list of diets to search
         * @return list of valid recipes
         * @throws DataAccessException if recipes cannot be loaded for any reason
         */
        List<Recipe> loadRecipes(Map<String, Boolean> diets) throws DataAccessException;
        /**
         * Returns list of found recipes
         * @param maxReadyTime maximum preparation time
         * @return list of valid recipes
         * @throws DataAccessException if recipes cannot be loaded for any reason
         */
        List<Recipe> loadRecipes(int maxReadyTime) throws DataAccessException;

    }
