package interface_adapter.calendar;

import interface_adapter.ViewModel;
import interface_adapter.change_password.LoggedInState;

/**
 * The View Model for the Calendar View.
 */
public class CalendarViewModel extends ViewModel<CalendarState> {

    public CalendarViewModel() {
        super("calendar");
        setState(new CalendarState());
    }
}
