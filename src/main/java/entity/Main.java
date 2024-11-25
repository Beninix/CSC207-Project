package entity;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Create user
        CommonUser user = new CommonUser("a","b");

        //Add examples
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
        user.addRecipe(recipe);

        ingredients = new ArrayList<String>();
        name = "Strawberry Banana Smoothie";
        ingredients.add("strawberries");
        ingredients.add("bananas");
        ingredients.add("milk");
        ingredients.add("yogurt");
        instructions = "Blend all the ingredients together.";
        cookingTime = 2;
        diets = new HashMap<String, Boolean>();
        diets.put("vegan",true);
        diets.put("vegetarian",true);
        diets.put("glutenFree",true);
        diets.put("dairyFree",false);
        nutrition = new Nutrition(300, 2, 15, 7, 0, 0, 8);
        Recipe recipe2 = new Recipe(name,ingredients,instructions,cookingTime,diets,nutrition);
        user.addRecipe(recipe2);

        ingredients = new ArrayList<String>();
        name = "Egg Salad";
        ingredients.add("eggs");
        ingredients.add("mayonnaise");
        ingredients.add("green onions");
        ingredients.add("paprika");
        instructions = "Hard boil the eggs, then peel and dice. Mix the eggs with mayonnaise, paprika and sliced green onions. Season to taste.";
        cookingTime = 15;
        diets = new HashMap<String, Boolean>();
        diets.put("vegan",false);
        diets.put("vegetarian",false);
        diets.put("glutenFree",true);
        diets.put("dairyFree",true);
        nutrition = new Nutrition(600, 10, 1, 2, 5, 5, 20);
        Recipe recipe3 = new Recipe(name,ingredients,instructions,cookingTime,diets,nutrition);
        user.addRecipe(recipe3);

        while(true){
            List<String> dietTypes = Arrays.asList("vegan", "vegetarian", "glutenFree", "dairyFree");

            diets = new HashMap<String, Boolean>();

            //Pick diets to search for
            System.out.println("Please enter either Y or N for each dietary restriction, then hit enter:");

            for (String diet : dietTypes) {
                System.out.println(diet + "?");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.next();
                if (input.equals("Y")) {
                    diets.put(diet, true);
                } else {
                    diets.put (diet, false);
                }
            }

            List<Recipe>search = RecipeSearch.dietSearch(user.getRecipeCollection(), diets);

            if (!search.isEmpty()) {
                for (Recipe r : search) {
                    System.out.println("Found: " + r.getName());
                    r.printRecipe();
                }
            } else {
                System.out.println("Sorry, no recipes found.");
            }
        }
    }
}