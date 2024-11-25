package interface_adapter.search;

import interface_adapter.ViewModel;
import interface_adapter.calendar.CalendarState;

/**
 * The View Model for the Search View.
 */
public class SearchViewModel extends ViewModel<SearchState> {

    public SearchViewModel() {
        super("search");
        setState(new SearchState());
    }
}