package entity;

import java.util.List;

public class ExportCalendar {
    private List<String> events;  // A list of event strings or event objects
    private String calendarName;  // Name of the calendar or other relevant details

    // Constructor to initialize ExportCalendar with a list of events and a calendar name
    public ExportCalendar(List<String> events, String calendarName) {
        this.events = events;
        this.calendarName = calendarName;
    }

    // Getters for the attributes
    public List<String> getEvents() {
        return events;
    }

    public String getCalendarName() {
        return calendarName;
    }

    // Optionally, you can add setters if needed, though it might not be required depending on your use case.
}
