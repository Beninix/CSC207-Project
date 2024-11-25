package entity;

import java.util.ArrayList;

/**
 * A simple implementation of the User interface.
 */
public class CommonUser implements User {

    private final String name;
    private final String password;
    private ArrayList<Recipe> recipeCollection = new ArrayList<>();

    public CommonUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    // Brandon's
    @Override
    public void addRecipe(Recipe recipe){
        recipeCollection.add(recipe);
    }

    // Brandon's
    @Override
    public ArrayList<Recipe> getRecipeCollection() {return recipeCollection;}

    // Emily's
    @Override
    public String getRecipe(String recipeName){
        for (int i = 0; i < recipeCollection.size(); i++){
            if (recipeCollection.get(i).getName().equals(recipeName)){
                return recipeCollection.get(i).getName();
            }
        }
        return null;
    }

}
