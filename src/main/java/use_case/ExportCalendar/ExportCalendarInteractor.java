package use_case.ExportCalendar;
import entity.ExportCalendar;
import java.io.IOException;
import java.util.List;
public class ExportCalendarInteractor implements ExportCalendarInputBoundary {
    private final ExportCalendarDataAccessInterface dataAccess;
    private final ExportCalendarOutputBoundary presenter;
    public ExportCalendarInteractor(ExportCalendarDataAccessInterface dataAccess, ExportCalendarOutputBoundary presenter) {
        this.dataAccess = dataAccess;
        this.presenter = presenter;
    }
    @Override
    public void export(String filename) {
        try {
            List<String> events = dataAccess.getCalendarEvents();
            ExportCalendar exportCalendar = new ExportCalendar();
            exportCalendar.exportToICS(filename, events);
            presenter.presentSuccess("Calendar exported successfully to: " + filename);
        } catch (IOException e) {
            presenter.presentError("Failed to export calendar: " + e.getMessage());
        }
    }
}
