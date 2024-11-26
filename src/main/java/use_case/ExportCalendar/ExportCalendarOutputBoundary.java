package use_case.ExportCalendar;
public interface ExportCalendarOutputBoundary {
    void presentSuccess(String message);
    void presentError(String message);
}