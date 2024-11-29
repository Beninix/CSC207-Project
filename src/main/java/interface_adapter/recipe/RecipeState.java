package interface_adapter.recipe;

import entity.Recipe;

/**
 * The state for the Recipe View Model.
 */
public class RecipeState {
    private String recipeName = "";
    private String recipeError;
    private Recipe recipe;

    public String getRecipeName(){
        return recipeName;
    }

    public String getRecipeError(){return recipeError;}

    public void setRecipe(Recipe recipe){
        this.recipe = recipe;
    }

    public Recipe getRecipe(){return recipe;}

    public void setRecipeError(String recipeError){
        this.recipeError = recipeError;
    }

    public void setRecipeName(String recipeName){
        this.recipeName = this.recipe.getName();
    }

}
