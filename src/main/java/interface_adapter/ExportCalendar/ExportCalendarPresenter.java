package interface_adapter.ExportCalendar;

import use_case.ExportCalendar.ExportCalendarOutputBoundary;

public class ExportCalendarPresenter implements ExportCalendarOutputBoundary {

    @Override
    public void presentSuccess(String message) {
        System.out.println("SUCCESS: " + message);
    }

    @Override
    public void presentError(String message) {
        System.err.println("ERROR: " + message);
    }
}