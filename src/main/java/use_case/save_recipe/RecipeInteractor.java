package use_case.save_recipe;

import entity.Recipe;

public class RecipeInteractor implements RecipeInputBoundary {
   private final RecipeOutputBoundary recipeOutputBoundary;
   private final RecipeDataAccessInterface recipeDataAccessObject;

   public RecipeInteractor(RecipeOutputBoundary recipeOutputBoundary, RecipeDataAccessInterface recipeDataAccessObject) {
       this.recipeOutputBoundary = recipeOutputBoundary;
       this.recipeDataAccessObject = recipeDataAccessObject;
   }

   @Override
   public void execute(RecipeInput recipeInput) {
      final Recipe chosenRecipe = recipeInput.getRecipe();
      if (!recipeDataAccessObject.existsByName(chosenRecipe.getName())) {
         recipeDataAccessObject.save(chosenRecipe);
         final RecipeOutputData recipeOutput = new RecipeOutputData(chosenRecipe, false);
         recipeOutputBoundary.prepareSuccessView(recipeOutput);
      }
      else {
         recipeOutputBoundary.prepareFailView("Recipe already bookmarked.");
      }
   }
}
