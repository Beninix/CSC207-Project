package use_case.save_recipe;


import entity.CommonUser;
import entity.Recipe;
import entity.User;
import use_case.login.LoginUserDataAccessInterface;

public class RecipeInteractor implements RecipeInputBoundary {

    private final RecipeDataAccessInterface recipeDataAccessObject;
    private final RecipeOutputBoundary recipeOutputBoundary;

    public RecipeInteractor(RecipeDataAccessInterface recipeDataAccessObject, RecipeOutputBoundary recipeOutputBoundary) {

       this.recipeOutputBoundary = recipeOutputBoundary;
       this.recipeDataAccessObject = recipeDataAccessObject;
       this.recipeUser = recipeUser;
   }

   @Override

      public void execute(RecipeInput recipeInput) {
         final Recipe chosenRecipe = recipeInput.getRecipe();
         final CommonUser user = recipeInput.getUser();

         if (user.getRecipe(chosenRecipe.getName()) != null) {
            recipeOutputBoundary.prepareFailView("Recipe is already in bookmarks");
         }
         else {
         user.addRecipe(chosenRecipe);
         final RecipeOutputData recipeOutputData = new RecipeOutputData(chosenRecipe.getName(), false);
         recipeOutputBoundary.prepareSuccessView(recipeOutputData);

      }
   }
}
