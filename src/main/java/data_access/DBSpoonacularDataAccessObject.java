package data_access;

import entity.Nutrition;
import entity.Recipe;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import use_case.spoonacular.DataAccessException;
import use_case.spoonacular.SpoonacularDataAccessInterface;

import java.io.IOException;
import java.util.*;

public class DBSpoonacularDataAccessObject implements SpoonacularDataAccessInterface {
    private static final String BASEURL = "https://api.spoonacular.com/recipes/complexSearch?";
    private static final String TOKEN = "token";
    private static final String NUMBER = "&number=3";
    private static final String INSTRUCTIONSREQUIRED = "&instructionsRequired=true";
    private static final String ADDINFORMATION = "&addRecipeInformation=true";
    private static final String RESULT = "results";
    private static final String ADDINGREDIENTS = "&fillIngredients=true";
    private static final String ADDNUTRITION = "&addRecipeNutrition=true";
    @Override
    public String filterDiets(Map<String, Boolean> diets){
        if(diets!=null){
            StringBuilder output = new StringBuilder();
            output.append("&diet=");
            for(Map.Entry<String,Boolean> diet : diets.entrySet()){
                if(diet.getValue()){
                    output.append("," + diet.getKey());
                }
            }
            output.deleteCharAt(6);
            return output.toString();
        }
        return "";
    }
    public String filterIngredients(List<String> ingredients){
        if(ingredients!=null){
            StringBuilder output = new StringBuilder();
            output.append("&ingredients=");
            for(String ingredient: ingredients){
                output.append("," + ingredient);
            }
            output.deleteCharAt(6);
            return output.toString();
        }
        return "";
    }
    public String filterCalories(int calories){
        if(calories>0){
            return "&maxCalories="+calories;
        }
        return "";
    }
    public String filterCookingTime(int cookingTime){
        if(cookingTime>0){
            return "&maxReadyTime="+cookingTime;
        }
        return "";
    }
    public List<Recipe> loadRecipes(Map<String, Boolean> diets,List<String> ingredients,int calories,int cookingTime) throws DataAccessException {
        return callSpoonacular(filterDiets(diets)
                +filterIngredients(ingredients)
                +filterCalories(calories)
                +filterCookingTime(cookingTime));
    }
    public List<Recipe> loadRecipes(String filters) throws DataAccessException {
        return callSpoonacular(filters);
    }
    public List<Recipe> callSpoonacular(String filters) throws DataAccessException {
        // Make an API call to get the user object.
        final String token = "apiKey=" + System.getenv(TOKEN);
        final OkHttpClient client = new OkHttpClient().newBuilder().build();
        final Request request = new Request.Builder()
                .url(BASEURL
                        + token
                        + NUMBER
                        + INSTRUCTIONSREQUIRED
                        + ADDINFORMATION
                        + ADDINGREDIENTS
                        + ADDNUTRITION
                        + filters)
                .build();
        try {
            final Response response = client.newCall(request).execute();

            final JSONObject responseBody = new JSONObject(response.body().string());

            final JSONArray searchJSONArray = responseBody.getJSONArray(RESULT);
            List<Recipe> recipes = new ArrayList<>();
            for (int i = 0; i < searchJSONArray.length(); i++) {
                recipes.add(jsonToRecipe(searchJSONArray.getJSONObject(i)));
            }
            return recipes;

        }
        catch (IOException | JSONException ex) {
            throw new use_case.spoonacular.DataAccessException(ex.getMessage());
        }
    }
    public Recipe jsonToRecipe(JSONObject recipeJSON) {
        String name = recipeJSON.getString("title");
        List<String> ingredients = new ArrayList<String>();
        JSONArray ingredientsJSON = recipeJSON.getJSONArray("extendedIngredients");
        for (int i = 0; i < ingredientsJSON.length(); i++) {
            ingredients.add(ingredientsJSON.getJSONObject(i).getString("name"));
        }
        StringBuilder stringBuilder = new StringBuilder();
        JSONArray instructionsJSON = recipeJSON.getJSONArray("analyzedInstructions").getJSONObject(0).getJSONArray("steps");
        for (int i = 0; i < instructionsJSON.length(); i++) {
            stringBuilder.append(instructionsJSON.getJSONObject(i).getString("step"));
        }
        String instructions = stringBuilder.toString();
        int cookingTime = recipeJSON.getInt("readyInMinutes");
        String[] dietNames= {"vegetarian","vegan","glutenFree","dairyFree","cheap","sustainable"};
        Map<String, Boolean> diets = new HashMap<String, Boolean>();
        for(String d : dietNames){
            diets.put(d, recipeJSON.getBoolean(d));
        }
        JSONArray nutrientJSON = recipeJSON.getJSONObject("nutrition").getJSONArray("nutrients");
        Map<String, Integer> nutrients = new HashMap<String, Integer>();
        Integer[] nutrientIndexes = {0,1,3,6,7,10,12};
        String[] nutrientNames = {"calories","fat","carbohydrates","cholesterol","sodium","protein","fiber"};
        for(int i = 0; i < nutrientIndexes.length; i++){
            nutrients.put(nutrientNames[i]
                    ,nutrientJSON
                            .getJSONObject(nutrientIndexes[i])
                            .getBigDecimal("amount")
                            .intValue());
        }
        Nutrition nutrition = new Nutrition(nutrients.get("calories")
                ,nutrients.get("fat")
                ,nutrients.get("carbohydrates")
                ,nutrients.get("cholesterol")
                ,nutrients.get("sodium")
                ,nutrients.get("protein")
                ,nutrients.get("fiber"));
        return new Recipe(name,ingredients, instructions,cookingTime,diets,nutrition);
    }
}
