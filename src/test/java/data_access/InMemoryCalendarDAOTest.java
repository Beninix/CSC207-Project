package data_access;

import entity.Recipe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the {@link InMemoryCalendarDAO} class. These tests ensure that the methods in
 * the DAO correctly generate and format calendar events based on the mock recipe data. The tests
 * verify that the events are created correctly, the list of events is not empty, and the number of
 * events corresponds to the number of days with recipes in the week.
 */
public class InMemoryCalendarDAOTest {

    private InMemoryCalendarDAO dao;

    /**
     * Sets up the test environment by initializing a new instance of {@link InMemoryCalendarDAO}.
     */
    @BeforeEach
    public void setUp() {
        dao = new InMemoryCalendarDAO();
    }

    /**
     * Tests the {@link InMemoryCalendarDAO#getCalendarEvents()} method to ensure that the calendar
     * events are generated correctly.
     * <p>
     * This test verifies that the generated events contain the required fields, such as DTSTART, SUMMARY,
     * DESCRIPTION, and LOCATION. It also checks that the list of events is not empty.
     * </p>
     */
    @Test
    public void testGetCalendarEvents() {
        List<String> events = dao.getCalendarEvents();

        // Assert that the list of events is not empty
        assertFalse(events.isEmpty(), "No events should be generated.");

        // Check if events are correctly formatted
        for (String event : events) {
            assertTrue(event.contains("DTSTART:"), "Event should contain DTSTART.");
            assertTrue(event.contains("SUMMARY:"), "Event should contain SUMMARY.");
            assertTrue(event.contains("DESCRIPTION:"), "Event should contain DESCRIPTION.");
            assertTrue(event.contains("LOCATION:"), "Event should contain LOCATION.");
        }
    }

    /**
     * Tests that the number of calendar events matches the number of days with recipes.
     * <p>
     * This test checks whether the number of events generated corresponds to the number of days in the
     * week that have associated recipes. The method compares the size of the event list with the number
     * of days with recipes in the chosen week.
     * </p>
     */
    @Test
    public void testGetCalendarEventsSize() {
        // Generate calendar events and check the size
        List<String> events = dao.getCalendarEvents();

        // The number of events should match the number of recipes for the week
        List<List<Object>> chosenWeek = dao.getChosenWeek();
        int expectedEventCount = chosenWeek.size(); // Number of days in the week with events
        assertEquals(expectedEventCount, events.size(), "The number of events should match the number of days with recipes.");
    }
}
