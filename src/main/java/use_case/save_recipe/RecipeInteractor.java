package use_case.save_recipe;

import data_access.DBUserDataAccessObject;
import entity.CommonUser;
import entity.Recipe;
import entity.User;
import use_case.login.LoginUserDataAccessInterface;

public class RecipeInteractor implements RecipeInputBoundary {
   private final RecipeOutputBoundary recipeOutputBoundary;
   private final RecipeDataAccessInterface recipeDataAccessObject;
   private final DBUserDataAccessObject recipeUser;

   public RecipeInteractor(RecipeOutputBoundary recipeOutputBoundary, RecipeDataAccessInterface recipeDataAccessObject,
                           DBUserDataAccessObject recipeUser) {
       this.recipeOutputBoundary = recipeOutputBoundary;
       this.recipeDataAccessObject = recipeDataAccessObject;
       this.recipeUser = recipeUser;
   }

   @Override
   public void execute(RecipeInput recipeInput) {
      CommonUser user = (CommonUser) recipeUser.get(recipeInput.getUser());
      final Recipe chosenRecipe = recipeInput.getRecipe();
      if (!recipeDataAccessObject.existsByName(chosenRecipe.getName())) {
         recipeDataAccessObject.save(chosenRecipe);
         recipeUser.saveRecipe(user, chosenRecipe);
         final RecipeOutputData recipeOutput = new RecipeOutputData(chosenRecipe, false);
         recipeOutputBoundary.prepareSuccessView(recipeOutput);
      }
      else {
         recipeOutputBoundary.prepareFailView("Recipe already bookmarked.");
      }
   }
}
