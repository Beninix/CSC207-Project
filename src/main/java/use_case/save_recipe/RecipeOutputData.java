package use_case.save_recipe;

public class RecipeOutputData {
    private final String recipeName;
    private final boolean useCaseFailed;

    public RecipeOutputData(String recipeName, boolean useCaseFailed) {
        this.recipeName = recipeName;
        this.useCaseFailed = useCaseFailed;
    }

    public String getRecipeName() {
        return recipeName;
    }
}
