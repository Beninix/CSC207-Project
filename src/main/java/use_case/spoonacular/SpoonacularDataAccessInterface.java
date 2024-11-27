package use_case.spoonacular;

import entity.Recipe;
import use_case.spoonacular.DataAccessException;

import java.util.List;
import java.util.Map;

/**
 * Interface for the NoteDAO. It consists of methods for
 * both loading and saving a note.
 */
public interface SpoonacularDataAccessInterface {
    String filterDiets(Map<String, Boolean> diets);
    String filterIngredients(List<String> ingredients);
    String filterCalories(int calories);
    String filterCookingTime(int cookingTime);
    /**
    * Returns list of found recipes
    * @param diets diets to search by
    * @param ingredients ingredients to include
    * @param calories max calories
    * @param cookingTime max cooking time
    * @return list of valid recipes
    * @throws DataAccessException if recipes cannot be loaded for any reason
    */
    List<Recipe> loadRecipes(Map<String, Boolean> diets,List<String> ingredients,int calories,int cookingTime) throws DataAccessException;
    /**
    * Returns list of found recipes
    * @param filters the filters in string form
    * @return list of valid recipes
    * @throws DataAccessException if recipes cannot be loaded for any reason
    */
    List<Recipe> loadRecipes(String filters) throws DataAccessException;

}
