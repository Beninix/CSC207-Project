package use_case.ExportCalendar;
import java.util.List;

/**
 * The ExportCalendarDataAccessInterface provides an abstraction for retrieving calendar events.
 * Implementations of this interface are responsible for supplying event data to the interactor.
 */
public interface ExportCalendarDataAccessInterface {
    /**
     * Retrieves a list of calendar events.
     * Each event is formatted as a string that conforms to the ICS standard.
     *
     * @return a list of strings, where each string represents a calendar event.
     */
    List<String> getCalendarEvents();
}

