package interface_adapter.recipe;


import entity.CommonUser;

import entity.Recipe;

/**
 * The state for the Recipe View Model.
 */
public class RecipeState {
    private String recipeName = "";

    private CommonUser commonUser = null;
    private Recipe recipe = null;

    public String getRecipeName(){return recipeName;
    }

    public void setRecipeName(String recipeName){}

    public CommonUser getUser() {
        return commonUser;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setUser(CommonUser user) {this.commonUser = user;}

    public Recipe getNewRecipe() {
        return this.recipe;
    }

}
