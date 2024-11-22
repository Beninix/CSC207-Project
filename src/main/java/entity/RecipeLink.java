package entity;

import view.ConstantsView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A clickable button associated with a Recipe instance and has the recipe's name as its text.
 * Further implementation possibilities: add method to set the button properties?
 */
public class RecipeLink extends JButton {
    private final Recipe recipe;

    public static void main(String[] args) {
        String name = "PB&J Sandwich";
        List<String> ingredients = new ArrayList<String>();
        ingredients.add("peanut butter");
        ingredients.add("strawberry jam");
        ingredients.add("bread");
        String instructions = "Spread peanut butter on one slice of bread, spread the jam on another and then sandwich them.";
        int cookingTime = 3;
        Map<String, Boolean> diets = new HashMap<String, Boolean>();
        diets.put("vegan",true);
        diets.put("vegetarian",true);
        diets.put("glutenFree",false);
        diets.put("dairyFree",true);
        Nutrition nutrition = new Nutrition(500, 3, 20, 4, 1, 2, 15);
        Recipe recipe2 = new Recipe(name,ingredients,instructions,cookingTime,diets,nutrition);
        JButton recipeLink = new RecipeLink(recipe2);
        JPanel jPanel = new JPanel();
        JFrame jFrame = new JFrame();
        jPanel.add(recipeLink);
        jPanel.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setTitle("Bite Wise");
        jFrame.setSize(ConstantsView.PANELWIDTH, ConstantsView.PANELHEIGHT);
        jFrame.add(jPanel, BorderLayout.NORTH);
        jFrame.setVisible(true);
    }

    /**
     * Constructs a RecipeLink instance.
     * @param recipe - the recipe associated with this label
     */
    public RecipeLink(Recipe recipe) {
        this.recipe = recipe;
        setText(recipe.getName());
        this.setBorderPainted(false);
    }

    /**
     * Returns the Recipe instance associated with this label.
     */
    public Recipe getRecipeOfLink(){
        return this.recipe;
    }
}
