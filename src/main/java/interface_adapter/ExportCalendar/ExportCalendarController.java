package interface_adapter.ExportCalendar;

import use_case.ExportCalendar.ExportCalendarInputBoundary;

public class ExportCalendarController {

    private final ExportCalendarInputBoundary interactor;

    public ExportCalendarController(ExportCalendarInputBoundary interactor) {
        this.interactor = interactor;
    }

    public void handleExport(String filename) {
        interactor.export(filename);
    }
}