package entity;

import java.util.ArrayList;


/**
 * The representation of a password-protected user for our program.
 */
public class User {

    private final String name;
    private final String password;
    private ArrayList<Recipe> recipeCollection = new ArrayList<>();
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void addRecipe(Recipe recipe){
        recipeCollection.add(recipe);
    }
    public ArrayList<Recipe> getRecipeCollection() {return recipeCollection;}
    public String getRecipe(String recipeName){
        for (int i = 0; i < recipeCollection.size(); i++){
            if (recipeCollection.get(i).getName().equals(recipeName)){
                return recipeCollection.get(i).getName();
            }
        }
        return null;
    }
}
