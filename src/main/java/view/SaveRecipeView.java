package view;

import interface_adapter.note.RecipeControl;
import interface_adapter.note.RecipeState;
import interface_adapter.note.RecipeViewModel;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

/**
 * The Recipe view when the user is saving a recipe.
 */

public class SaveRecipeView extends JPanel  {
    private final String recipeView = "Bookmarks";
    private final RecipeViewModel recipeViewModel;

    private final JButton addRecipeButton;
    private final JButton cancelRecipeButton;
    private RecipeControl recipeControl;

    public SaveRecipeView(RecipeViewModel recipeViewModel) {
        this.recipeViewModel = recipeViewModel;

        final JLabel title = new JLabel("Bookmark recipe?");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        final JPanel buttons = new JPanel();
        addRecipeButton = new JButton("Add Recipe");
        buttons.add(addRecipeButton);
        cancelRecipeButton = new JButton("Cancel");
        buttons.add(cancelRecipeButton);
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