package interface_adapter.ExportCalendar;

import use_case.ExportCalendar.ExportCalendarInteractor;

import javax.swing.*;
import java.io.File;

/**
 * The ExportCalendarController is responsible for handling user actions related to exporting the calendar to an ICS file.
 * It interacts with the ExportCalendarInteractor to perform the export operation.
 */
public class ExportCalendarController {
    private final ExportCalendarInteractor interactor;

    /**
     * Constructs an ExportCalendarController with the specified interactor.
     *
     * @param interactor the interactor used to manage the export logic.
     */
    public ExportCalendarController(ExportCalendarInteractor interactor) {
        this.interactor = interactor;
    }
    /**
     * Handles the export process by allowing the user to choose a file save location and exporting the calendar to an ICS file.
     * If the export is successful, a confirmation message is displayed.
     * If the export fails, an error message is displayed with the reason.
     */
    public void handleExport() {
        // Open a file chooser dialog for user to select save location
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save ICS File");
        fileChooser.setSelectedFile(new File("calendar.ics"));

        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filename = fileToSave.getAbsolutePath();

            try {
                interactor.exportCalendar(filename);
                JOptionPane.showMessageDialog(null, "ICS file exported successfully!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Failed to export ICS: " + e.getMessage());
            }
        }
    }
}


