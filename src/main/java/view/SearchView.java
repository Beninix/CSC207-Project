package view;
import data_access.DBSpoonacularDataAccessObject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.*;
import java.util.List;

import javax.swing.*;

import entity.Recipe;
import interface_adapter.search.SearchState;
import interface_adapter.search.SearchViewModel;
import org.intellij.lang.annotations.Flow;
import use_case.spoonacular.DataAccessException;

/**
 * SearchView for when the user is logged into the program.
 */
public class SearchView extends JPanel implements ActionListener, PropertyChangeListener {
    private final String viewName = "search";
    private final SearchViewModel searchViewModel;
    final String[] dietNames = {"vegan", "vegetarian", "glutenFree", "dairyFree", "sustainable", "cheap"};
    final JCheckBox[] dietsCheckbox = new JCheckBox[dietNames.length];
    final JTextField ingredientsInputField = new JTextField(15);
    final JTextField cookingTimeInputField = new JTextField(15);
    final JTextField caloriesInputField = new JTextField(15);
    final String[][] dummy = {dietNames};
    final JPanel searchPanel;
    final JPanel resultsPanel;
    final String[] columnNames = {"Name", "Ingredients", "Instructions", "CookingTime", "Diets", "Calories", "Protein", "Sugar", "Fiber", "Sodium", "Cholesterol", "Fat"};

    @SuppressWarnings({"checkstyle:UnusedLocalVariable", "checkstyle:SuppressWarnings", "checkstyle:ExecutableStatementCount"})
    public SearchView(SearchViewModel searchViewModel) {
        this.searchViewModel = searchViewModel;
        final JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        this.add(mainPanel);
        // Labels and panels

        final JButton searchButton = new JButton("Search");
        searchButton.addActionListener(this);

        final JPanel ingredientsPanel = new JPanel();
        final JPanel dietsPanel = new JPanel();
        final JPanel cookingTimePanel = new JPanel();
        final JPanel caloriesPanel = new JPanel();

        final JLabel ingredientsLabel = new JLabel("Ingredients (, separated):");
        final JLabel dietsLabel = new JLabel("Diets:");
        final JLabel cookingTimeLabel = new JLabel("Cooking Time:");
        final JLabel caloriesLabel = new JLabel("Calories:");

        ingredientsPanel.add(ingredientsLabel);
        dietsPanel.add(dietsLabel);
        cookingTimePanel.add(cookingTimeLabel);
        caloriesPanel.add(caloriesLabel);

        searchPanel = new JPanel();
        searchPanel.setLayout(new BoxLayout(searchPanel, BoxLayout.Y_AXIS));
        searchPanel.add(new JLabel("Search"));
        mainPanel.add(searchPanel);
        searchPanel.add(ingredientsPanel);
        searchPanel.add(dietsPanel);
        searchPanel.add(cookingTimePanel);
        searchPanel.add(caloriesPanel);
        searchPanel.add(searchButton);

        // Ingredients input

        ingredientsPanel.add(ingredientsInputField);

        // Diets input
        for (int i = 0; i < dietNames.length; i++) {
            dietsCheckbox[i] = new JCheckBox(dietNames[i]);
            dietsPanel.add(dietsCheckbox[i]);
        }

        // Cooking time input

        cookingTimePanel.add(cookingTimeInputField);

        // Calories input

        caloriesPanel.add(caloriesInputField);

        resultsPanel = new JPanel();
        mainPanel.add(resultsPanel);
    }

    public String getViewName() {
        return viewName;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        DBSpoonacularDataAccessObject spoonacularDB = new DBSpoonacularDataAccessObject();
        Map<String, Boolean> diets = selectedDiets(this.dietsCheckbox);
        List<String> ingredients = Arrays.asList(this.ingredientsInputField.getText().split(","));
        String caloriesInput = this.caloriesInputField.getText();
        int calories = 0;
        int cookingTime = 0;
        String cookingTimeInput = this.cookingTimeInputField.getText();
        if (!caloriesInput.isEmpty()) {
            calories = Integer.parseInt(caloriesInput);
        }
        if (!cookingTimeInput.isEmpty()) {
            cookingTime = Integer.parseInt(cookingTimeInput);
        }
        try {
            List<Recipe> recipeList = spoonacularDB.callSpoonacular(
                    spoonacularDB.filterDiets(diets) +
                    spoonacularDB.filterIngredients(ingredients)+
                    spoonacularDB.filterCalories(calories)+
                    spoonacularDB.filterCookingTime(cookingTime));
            for (Recipe r : recipeList){
                r.printRecipe();
            }
            ArrayList<Recipe> temp = new ArrayList<>(recipeList);
            ArrayList<String[]> tempString = new ArrayList<>();
            tempString.add(columnNames);
            for (Recipe r : temp) {
                tempString.add(r.toRow());
            }
            String[][] recipes = new String[tempString.size()][tempString.get(0).length];
            for (int i = 0; i < tempString.size(); i++) {
                recipes[i] = tempString.get(i);
            }
            JTable recipeResults = new JTable(recipes,columnNames);
            resultsPanel.add(recipeResults);
        } catch (DataAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    @SuppressWarnings({"checkstyle:MissingJavadocMethod", "checkstyle:SuppressWarnings"})
    public Map<String, Boolean> selectedDiets(JCheckBox[] dietsCheckbox) {
        Map<String, Boolean> output = new HashMap<>();
        for (JCheckBox diet : dietsCheckbox) {
            if (diet.isSelected()) {
                output.put(diet.getText(), true);
            }
            else {
                output.put(diet.getText(), false);
            }
        }
        return output;
    }

    /**
     * Main.
     * @param args String
     */
    @SuppressWarnings({"checkstyle:UncommentedMain", "checkstyle:SuppressWarnings"})
    public static void main(String[] args) {
        final JFrame application = new JFrame("Recipe Search");
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.setLayout(new BoxLayout(application.getContentPane(),BoxLayout.X_AXIS));
        final SearchView searchView = new SearchView(new SearchViewModel());
        application.add(searchView, searchView.getViewName());
        application.setVisible(true);
        application.pack();
    }

    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @SuppressWarnings({"checkstyle:UnusedLocalVariable", "checkstyle:SuppressWarnings"})
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        final SearchState state = (SearchState) evt.getNewValue();
    }
}
