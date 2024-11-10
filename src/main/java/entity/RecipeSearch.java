package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecipeSearch {
    public static List<Recipe> dietSearch(List<Recipe> recipeList, Map<String, Boolean> diets){
        List<Recipe> output = new ArrayList<Recipe>();
        for (Recipe r : recipeList){
            Boolean invalid = false;
            for (Map.Entry<String, Boolean> entry : diets.entrySet()){
                if (entry.getValue() != r.getDiets().get(entry.getKey())){
                    invalid = true;
                    break;
                }
            }
            if (!invalid){
                output.add(r);
            }
        }
        return output;
    }
}
