package recipe;

import data_access.RecipeDataAccessObject;
import entity.*;
import org.junit.Test;
import use_case.save_recipe.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class RecipeInteractorTest {

    @Test
    public void successTest() {
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
        Recipe recipe = new Recipe(name,ingredients,instructions,cookingTime,diets,nutrition);

        CommonUser user = new CommonUser("a","b");
        RecipeInput recipeInput = new RecipeInput(user, recipe);
        RecipeDataAccessInterface recipeDAO = new RecipeDataAccessObject(recipe);

        RecipeOutputBoundary successPresenter = new RecipeOutputBoundary() {
            @Override
            public void prepareSuccessView(RecipeOutputData recipeOutput) {
                assertNotNull(user.getRecipe(recipe.getName()));
            }

            @Override
            public void prepareFailView(String sameRecipeError) {
                fail("Use case was not properly added.");

            }

        };
        RecipeInputBoundary interactor = new RecipeInteractor(recipeDAO, successPresenter);
        interactor.execute(recipeInput);
    }


}
