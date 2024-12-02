package use_case.ExportCalendar;

import entity.ExportCalendar;

import java.io.IOException;
import java.util.List;

/**
 * handles the business logic for exporting calendar events to an ICS file.
 *
 */
public class ExportCalendarInteractor {
    private final ExportCalendarDataAccessInterface dataAccess;

    /**
     * Constructs an ExportCalendarInteractor with the specified data access interface.
     *
     * @param dataAccess the data access interface for retrieving calendar events.
     */
    public ExportCalendarInteractor(ExportCalendarDataAccessInterface dataAccess) {
        this.dataAccess = dataAccess;
    }

    /**
     * Exports calendar events to an ICS file.
     *
     * @param filename the name of the file to save the ICS data to.
     * @throws IOException if an error occurs during file writing.
     */
    public void exportCalendar(String filename) throws IOException {
        // Fetch the calendar events from the DAO
        List<String> events = dataAccess.getCalendarEvents();

        // Use the ExportCalendar entity to perform the export
        ExportCalendar exportCalendar = new ExportCalendar();
        exportCalendar.exportToICS(filename, events);
    }
}


