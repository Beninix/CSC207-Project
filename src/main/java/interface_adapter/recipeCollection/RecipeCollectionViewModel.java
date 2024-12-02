package interface_adapter.recipeCollection;

import interface_adapter.ViewModel;

/**
 * The View Model for the Recipe Collection View.
 */
public class RecipeCollectionViewModel extends ViewModel<RecipeCollectionState> {

    public RecipeCollectionViewModel() {
        super("recipe collection");
        setState(new RecipeCollectionState());
    }
}
