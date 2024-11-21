package use_case.note.Recipe;

public class RecipeInteractor implements RecipeInputBoundary {
   private final RecipeOutputBoundary recipeOuputBoundary;

   public RecipeInteractor(RecipeOutputBoundary recipeOutputBoundary) {
       this.recipeOuputBoundary = recipeOutputBoundary;
   }

   public void execute(RecipeInput recipeInput) {
   }
}
