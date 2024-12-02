package interface_adapter.recipe;

import interface_adapter.ViewModel;

/**
 * The View Model for the Recipe View.
 */
public class RecipeViewModel extends ViewModel<RecipeState> {

    public RecipeViewModel() {
        super("bookmark");
        setState(new RecipeState());
    }

    @Override
    public RecipeState getState() {
        return super.getState();
    }
}
