package data_access;

import entity.Nutrition;
import entity.Recipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Creates an in memory Week Data Access Object for purposes of testing and development.
 */
public class InMemoryCalendarDAO {
    private List<List<Object>> chosenWeek = new ArrayList<>();
    private List<Recipe> allRecipes = new ArrayList<>();
    // Dates format: YYYYMMDD, Mon Dec 2, 2024 - Sat Dec 8, 2024.
    private List<Integer> allDays = new ArrayList<>(List.of(20241202, 20241203,
            20241204, 20241205, 20241206, 20241207, 20241208));

    public List<List<Object>> getChosenWeek() {
        this.mockRecipeHelper();

        for (int i = 0; !(i == 7); i++) {
            List<Object> oneDay = new ArrayList<>();
            oneDay.add(allDays.get(i));
            oneDay.add(allRecipes.get(i));
            chosenWeek.add(oneDay);
        }
        return chosenWeek;
    }

    /**
     * Populates allRecipes list with mock data.
     */
    private void mockRecipeHelper() {
        for (int i=0; !(i==7); i++) {
            String name = "Sandwich";
            List<String> ingredients = new ArrayList<String>();
            ingredients.add("peanut butter");
            ingredients.add("strawberry jam");
            ingredients.add("bread");
            String instructions = "Spread peanut butter on one slice of bread.";
            int cookingTime = 3;
            Map<String, Boolean> diets = new HashMap<String, Boolean>();
            diets.put("vegan", true);
            diets.put("vegetarian", true);
            diets.put("glutenFree", false);
            diets.put("dairyFree", true);
            Nutrition nutrition = new Nutrition(500, 3, 20, 4, 1, 2, 15);

            allRecipes.add(new Recipe(name, ingredients, instructions, cookingTime, diets, nutrition));
        }
    }

    /**
     * Testing that code works
     * @param args - no args
     */
    public static void main(String[] args) {
        InMemoryCalendarDAO testWeekDAO = new InMemoryCalendarDAO();
        System.out.println(testWeekDAO.getChosenWeek());
    }
}