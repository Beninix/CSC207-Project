package data_access;

import entity.ExportCalendar;
import entity.Recipe;
import use_case.export_calendar.ExportCalendarDataAccessInterface;
import use_case.export_calendar.ExportCalendarInteractor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * InMemoryCalendarDAO is a data access object (DAO) implementation used for testing and development purposes.
 * It simulates fetching a week's worth of events with recipes, allowing the application to generate calendar events.
 * This class stores mock data for recipes and generates a list of calendar events formatted in ICS format.
 */
public class InMemoryCalendarDAO implements ExportCalendarDataAccessInterface {
    private List<List<Object>> chosenWeek = new ArrayList<>();
    private List<Recipe> allRecipes = new ArrayList<>();
    private List<Integer> allDays = new ArrayList<>(List.of(20241202, 20241203, 20241204, 20241205, 20241206, 20241207, 20241208));

    /**
     * Constructor for the InMemoryCalendarDAO class. Initializes the mock recipe data.
     */
    public InMemoryCalendarDAO() {
        this.mockRecipeHelper();
    }

    /**
     * Populates the list of allRecipes with mock recipe data for the week.
     * Each recipe has a name, instructions, and other details such as ingredients and dietary restrictions.
     */
    private void mockRecipeHelper() {
        for (int i = 0; i < 7; i++) {
            String name;
            String instructions;

            switch (i) {
                case 0:
                    name = "Sandwich";
                    instructions = "Spread peanut butter on one slice of bread.";
                    break;
                case 1:
                    name = "Salad";
                    instructions = "Toss mixed greens with olive oil and vinegar.";
                    break;
                case 2:
                    name = "Pasta";
                    instructions = "Boil water, cook pasta, and add sauce.";
                    break;
                // Add more cases for different recipes
                default:
                    name = "Sandwich";
                    instructions = "Spread peanut butter on one slice of bread.";
            }

            List<String> ingredients = List.of("ingredient1", "ingredient2");
            int cookingTime = 5;
            Map<String, Boolean> diets = new HashMap<>();
            diets.put("vegan", true);
            diets.put("vegetarian", true);
            diets.put("glutenFree", false);
            diets.put("dairyFree", true);

            allRecipes.add(new Recipe(name, ingredients, instructions, cookingTime, diets, null));
        }
    }

    /**
     * Gets the list of days for the current week, paired with the corresponding recipes.
     *
     * @return A list of lists, where each inner list represents a day with a date and a corresponding recipe.
     */
    public List<List<Object>> getChosenWeek() {
        chosenWeek.clear(); // Clear the previous week data

        // Ensure allRecipes is populated before generating the chosenWeek
        for (int i = 0; i < 7; i++) {
            List<Object> oneDay = new ArrayList<>();
            oneDay.add(allDays.get(i));
            oneDay.add(allRecipes.get(i));
            chosenWeek.add(oneDay);
        }
        return chosenWeek;
    }

    /**
     * Gets the list of events for a week. Each event corresponds to a recipe for a day.
     *
     * @return A list of events formatted in ICS format.
     */
    public List<String> getCalendarEvents() {
        List<String> events = new ArrayList<>();

        // Ensure chosenWeek is populated
        this.getChosenWeek(); // Populating chosenWeek here ensures it's up-to-date

        // Check if chosenWeek is populated correctly
        System.out.println("Chosen Week Data:");
        for (List<Object> day : chosenWeek) {
            System.out.println(day);  // Print chosenWeek data for debugging
        }

        // Generate events from chosenWeek
        System.out.println("Generating Events:");
        for (List<Object> day : chosenWeek) {
            int date = (int) day.get(0);  // The date (YYYYMMDD format)
            Recipe recipe = (Recipe) day.get(1);  // The recipe associated with the day

            // Format the event correctly for ICS
            String event = String.format(
                    "DTSTART:%dT000000Z\nDTEND:%dT010000Z\nSUMMARY:Try recipe: %s\nDESCRIPTION:%s\nLOCATION:Home",
                    date, date, recipe.getName(), recipe.getInstructions()
            );

            // Print each event before adding it to the list
            System.out.println("Event: " + event);

            events.add(event);
        }

        return events;
    }

    // Test the DAO
    public static void main(String[] args) throws IOException {
        InMemoryCalendarDAO calendarDAO = new InMemoryCalendarDAO();
        ExportCalendarInteractor interactor = new ExportCalendarInteractor(calendarDAO);

        interactor.exportCalendar("calendar.ics");
    }
}
