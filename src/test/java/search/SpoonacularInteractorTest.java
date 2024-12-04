package search;

import data_access.DBSpoonacularDataAccessObject;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import use_case.spoonacular.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class SpoonacularInteractorTest {

    @Test
    public void successTest() throws DataAccessException {
        Map<String, Boolean> diets = new HashMap<>();
        diets.put("vegan", false);
        diets.put("vegetarian", false);
        diets.put("glutenFree", true);
        diets.put("dairyFree", false);
        diets.put("sustainable", true);
        diets.put("cheap", true);
        List<String> ingredients = new ArrayList<>();
        ingredients.add("egg");
        int calories = 500;
        int cookingTime = 50;

        SpoonacularDataAccessInterface spoonacularDAO = new DBSpoonacularDataAccessObject();
        SpoonacularInput spoonacularInput = new SpoonacularInput(diets,ingredients,calories,cookingTime, new DBSpoonacularDataAccessObject());

        SpoonacularOutputBoundary successPresenter = new SpoonacularOutputBoundary() {
            @Override
            public void prepareSuccessView(SpoonacularOutputData spoonacularOutput) throws DataAccessException {
                assertNotNull(spoonacularDAO.loadRecipes(diets,ingredients,calories,cookingTime));
            }

            @Override
            public void prepareFailView(String noRecipesError) {
                fail("Recipes search failed");

            }

        };
        SpoonacularInputBoundary interactor = new SpoonacularInteractor(spoonacularDAO, successPresenter);
        interactor.execute(spoonacularInput);

    }


}

