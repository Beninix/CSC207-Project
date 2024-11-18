package view;

import entity.Recipe;
import entity.User;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static app.BuildAppWindow.*;

/**
 * The Recipe view when the user is viewing a recipe.
 */
public class RecipeView extends JPanel  {
    private Recipe newRecipe;
    private User user; // IDK why it's like this lowkey

    public RecipeView() {
        // need to retrieve the selected recipe
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel recipeName = new JLabel(newRecipe.getName());
        recipeName.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(recipeName);

        JTextArea selectedRecipe = new JTextArea(String.valueOf(newRecipe.getAllDetails()));
        selectedRecipe.setEditable(false);
        selectedRecipe.setLineWrap(true);
        selectedRecipe.setWrapStyleWord(true);
        this.add(selectedRecipe);

        final JPanel recipeButtons = new JPanel();
        recipeButtons.setLayout(new BoxLayout(recipeButtons, BoxLayout.X_AXIS)); // tried to make them be horizontially positioned

        JButton addRecipeButton = new JButton("Add Recipe");
        recipeButtons.add(addRecipeButton);
        JButton backButton = new JButton("Back");
        recipeButtons.add(backButton);

        addRecipeButton.addActionListener(e -> {
            user.addRecipe(newRecipe);
        });
        this.add(recipeButtons);

        //    public RecipeView() {
        //        buttonsPanelInvisible();
        //        this.setLayout(null);
        //    }
        // printed out recipe that was selected
    }
}
