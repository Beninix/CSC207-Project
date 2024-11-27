package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Calendar class stores a list of recipes that the user has mapped to desired
 * dates.
 */
public class Calendar {
    private Map<Integer, List<Recipe>> dateToRecipe;

    public boolean add_recipe(Integer yyyymmdd, Recipe recipe) {

//        List<Recipe> listOfRecipes = new ArrayList<>();
//        Integer dateToAddTo =         dateToRecipe.
//
//        dateToRecipe.put(yyyymmdd, recipeAdd);
//        return true;
    }

    /**
     * Method for providing data for 1 chosen week of recipes
     * in a list of lists. (For export function)
     */
    public List<List<Object>> getWeekForExport (Integer yyyymmdd) {

        for (int i; !(i==6); i++) {
            // int counter = yyyymmdd + i;
            // dateToRecipe.get(yyyymmdd);
            // check if is leap year (use mod) and check if has 30 or 31 days.
            // cycle through for loop 7 days, to get proper days.
            //
            //  Check if the given month is February.
            //      If True Check if the year is a year leap or not.
            //      If year is a leap year Print 29 Days, Else Print 28 Days.
            //  Now, check if month is 1, 3, 5, 7, 8, 10, 12, then print 31 days.
            //  Check if month is 4, 6, 9, 11 then print 30 days.
        }

        List<List<Object>> result = new ArrayList<>();
        return result;

    }

}
