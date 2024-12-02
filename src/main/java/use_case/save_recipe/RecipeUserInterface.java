package use_case.save_recipe;

import entity.CommonUser;
import entity.Recipe;

public interface RecipeUserInterface {
    void saveRecipe(CommonUser user, Recipe recipe);
}
