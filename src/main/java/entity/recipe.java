public class recipe {
    private List<String> ingredients = new ArrayList<String>();
    private String instructions;
    private int totalCalories;
    private int cookingTime;
    private Map<String, boolean> diets = new HashMap<String, boolean>();
    private Nutrition nutrition;
    public recipe(List<String> ingredients, String instructions, int totalCalories, int cookingTime, Map<String,Boolean> diets, Nutrition nutrition) {
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.totalCalories = totalCalories;
        this.cookingTime = cookingTime;
        this.diets = diets;
        this.nutrition = nutrition;
    }
    public Nutrition getNutrition() {
        return nutrition;
    }

    public Map<String, boolean> getDiets() {
        return diets;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

}