package use_case.save_recipe;
import entity.Recipe;

import java.util.List;


public interface RecipeDataAccessInterface {
    boolean existsByName(String recipeName);

    Recipe getRecipeName(String recipeName);

    Recipe getRecipe(String recipeName);
}
