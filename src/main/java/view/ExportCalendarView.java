package view;

import interface_adapter.ExportCalendar.ExportCalendarController;
import interface_adapter.ExportCalendar.ExportCalendarPresenter;
import use_case.ExportCalendar.ExportCalendarInteractor;
import data_access.InMemoryCalendarDAO;

public class ExportCalendarView {

    public static void main(String[] args) {
        // Set up dependencies
        ExportCalendarPresenter presenter = new ExportCalendarPresenter();
        InMemoryCalendarDAO dataAccess = new InMemoryCalendarDAO(); // Use updated DAO
        ExportCalendarInteractor interactor = new ExportCalendarInteractor(dataAccess, presenter);
        ExportCalendarController controller = new ExportCalendarController(interactor);

        // Trigger export
        controller.handleExport("my_calendar.ics");
    }
}