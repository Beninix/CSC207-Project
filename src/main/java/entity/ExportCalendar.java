package entity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportCalendar {

    public void exportToICS(String filename, List<String> events) throws IOException {
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