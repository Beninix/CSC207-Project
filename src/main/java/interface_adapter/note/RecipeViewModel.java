package interface_adapter.note;

import interface_adapter.ViewModel;

public class RecipeViewModel extends ViewModel<RecipeState> {

    public RecipeViewModel() {
        super("bookmark");
        setState(new RecipeState());
    }
}
