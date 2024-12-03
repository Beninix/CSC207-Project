package view;

import entity.Nutrition;
import entity.Recipe;
import interface_adapter.recipe.RecipeControl;
import interface_adapter.recipe.RecipeState;
import interface_adapter.recipe.RecipeViewModel;
import interface_adapter.search.SearchViewModel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Recipe view when the user is saving a recipe.
 */

public class RecipeView extends JPanel implements ActionListener, PropertyChangeListener  {

    private final String viewName = "Saving Recipe";

    private final String recipeView = "Save";
    private final RecipeViewModel recipeViewModel;
    private final JLabel bookmarkLabel;
    private final JButton addRecipeButton;
    private final JButton cancelRecipeButton;
    private RecipeControl recipeControl;

    public RecipeView(RecipeViewModel recipeViewModel, Recipe recipe) {
        this.recipeViewModel = recipeViewModel;
        this.recipeViewModel.addPropertyChangeListener(this);
        final JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        this.add(mainPanel);
        final JPanel titlePanel = new JPanel();
        mainPanel.add(titlePanel);

        JLabel ingredientsLabel = new JLabel("Ingredients");
        JTextField ingredientsTextField = new JTextField(10);

        JLabel dietsLabel = new JLabel("Diets");
        JTextField dietsTextField = new JTextField(10);

        JLabel instructionsLabel = new JLabel("Instructions");
        JTextField instructionsTextField = new JTextField(10);

        JLabel nutritionLabel = new JLabel("Nutrition");
        JTextField nutritionTextField = new JTextField(10);

        final JPanel recipePanel = new JPanel();
        recipePanel.add(ingredientsLabel);
        recipePanel.add(ingredientsTextField);
        recipePanel.add(dietsLabel);
        recipePanel.add(dietsTextField);
        recipePanel.add(instructionsLabel);
        recipePanel.add(instructionsTextField);
        recipePanel.add(nutritionLabel);
        recipePanel.add(nutritionTextField);
        mainPanel.add(recipePanel);

        final JPanel buttons = new JPanel();
        bookmarkLabel= new JLabel("Bookmark recipe?");
        buttons.add(bookmarkLabel);
        addRecipeButton = new JButton("Add Recipe");
        buttons.add(addRecipeButton);
        cancelRecipeButton = new JButton("Cancel");
        buttons.add(cancelRecipeButton);
        mainPanel.add(buttons);

        if (recipe != null) {
            final JLabel title = new JLabel(recipe.getName());
            titlePanel.add(title);
            title.setAlignmentX(Component.CENTER_ALIGNMENT);
            ingredientsTextField.setText(recipe.getIngredients().toString());
            dietsTextField.setText(recipe.getDiets().toString());
            instructionsTextField.setText(recipe.getInstructions());
            nutritionTextField.setText(recipe.getNutrition().toString());
        }
        else {
            final JLabel title = new JLabel("No recipe");
            titlePanel.add(title);
        }
        addRecipeButton.addActionListener(

                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource().equals(addRecipeButton)) {
                            final RecipeState currentState = recipeViewModel.getState();

                            recipeControl.execute(currentState.getUser(), currentState.getNewRecipe());
                        }

                    }
                }
        );

        cancelRecipeButton.addActionListener(this);

    }

    public String getViewName() { return viewName; }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }

    @SuppressWarnings({"checkstyle:UncommentedMain", "checkstyle:SuppressWarnings"})
    public static void main(String[] args) {
        final JFrame application = new JFrame("Recipe");
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.setLayout(new BoxLayout(application.getContentPane(),BoxLayout.X_AXIS));
        List<String> ingredients = new ArrayList<>();
        ingredients.add("apple");
        ingredients.add("flour");
        ingredients.add("butter");
        ingredients.add("sugar");
        ingredients.add("water");
        Map<String,Boolean> diets = new HashMap<>();
        diets.put("vegan", true);
        diets.put("vegetarian", true);
        diets.put("glutenFree", false);
        diets.put("dairyFree", false);
        diets.put("sustainable", true);
        diets.put("cheap", true);
        Nutrition nutrition = new Nutrition(500, 3, 20, 1, 3, 5, 15);
        final RecipeView recipeView = new RecipeView(new RecipeViewModel(),
                new Recipe("Apple Pie", ingredients,"mix bake", 30, diets, nutrition));
        application.add(recipeView, recipeView.getViewName());
        application.setVisible(true);
        application.pack();
    }

}
//"public class RecipeView extends JPanel  {
//    private Recipe newRecipe;
//    private User user; // IDK why it's like this lowkey
//
//    public RecipeView() {
//        // need to retrieve the selected recipe
//        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//
//        JLabel recipeName = new JLabel(newRecipe.getName());
//        recipeName.setAlignmentX(Component.CENTER_ALIGNMENT);
//        this.add(recipeName);
//
//        JTextArea selectedRecipe = new JTextArea(String.valueOf(newRecipe.getAllDetails()));
//        selectedRecipe.setEditable(false);
//        selectedRecipe.setLineWrap(true);
//        selectedRecipe.setWrapStyleWord(true);
//        this.add(selectedRecipe);
//
//        final JPanel recipeButtons = new JPanel();
//        recipeButtons.setLayout(new BoxLayout(recipeButtons, BoxLayout.X_AXIS)); // tried to make them be horizontially positioned
//
//        JButton addRecipeButton = new JButton("Add Recipe");
//        recipeButtons.add(addRecipeButton);
//        JButton backButton = new JButton("Back");
//        recipeButtons.add(backButton);
//
//        addRecipeButton.addActionListener(e -> {
//            user.addRecipe(newRecipe);
//        });
//        this.add(recipeButtons);
//
//        //    public RecipeView() {
//        //        buttonsPanelInvisible();
//        //        this.setLayout(null);
//        //    }
//        // printed out recipe that was selected
//    }