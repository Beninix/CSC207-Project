package interface_adapter.recipe_collection;

import interface_adapter.ViewModel;
import interface_adapter.calendar.CalendarState;

public class RecipeCollectionViewModel extends ViewModel<RecipeCollectionState> {

    public RecipeCollectionViewModel() {
        super("recipe collection");
        setState(new RecipeCollectionState());
    }
}
