package view;

import interface_adapter.recipe.RecipeControl;
import interface_adapter.recipe.RecipeState;
import interface_adapter.recipe.RecipeViewModel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * The Recipe view when the user is saving a recipe.
 */

public class RecipeView extends JPanel implements ActionListener, PropertyChangeListener  {

    private final String viewName = "Saving Recipe";

    private final String recipeView = "Save";
    private final RecipeViewModel recipeViewModel;

    private final JButton addRecipeButton;
    private final JButton cancelRecipeButton;
    private RecipeControl recipeControl;

    public RecipeView(RecipeViewModel recipeViewModel) {
        this.recipeViewModel = recipeViewModel;
        this.recipeViewModel.addPropertyChangeListener(this);

        final JLabel title = new JLabel("Bookmark recipe?");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        final JPanel buttons = new JPanel();
        addRecipeButton = new JButton("Add Recipe");
        buttons.add(addRecipeButton);
        cancelRecipeButton = new JButton("Cancel");
        buttons.add(cancelRecipeButton);

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