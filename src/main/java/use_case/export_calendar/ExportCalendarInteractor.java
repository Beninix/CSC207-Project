package use_case.export_calendar;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import entity.ExportCalendar;

/**
 * Handles the business logic for exporting calendar events to an ICS file.
 *
 */
public class ExportCalendarInteractor {
    private final ExportCalendarDataAccessInterface dataAccess;

    /**
     * Constructs an ExportCalendarInteractor with the specified data access interface.
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
        final List<String> events = dataAccess.getCalendarEvents();
        StringBuilder sb = new StringBuilder();

        sb.append("BEGIN:VCALENDAR\n");
        sb.append("VERSION:2.0\n");
        sb.append("PRODID:-//YourApp//EN\n");

        for (String event : events) {
            sb.append("BEGIN:VEVENT\n");
            sb.append(event);
            sb.append("\nEND:VEVENT\n");
        }

        sb.append("END:VCALENDAR\n");

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(sb.toString());
        }
    }
}

