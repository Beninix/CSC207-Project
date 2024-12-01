package interface_adapter.ExportCalendar;

/**
 * The ExportCalendarPresenter serves as a bridge between the user interface and the controller for exporting the calendar.
 * It coordinates the handling of export-related actions by delegating to the ExportCalendarController.
 */
public class ExportCalendarPresenter {
    private final ExportCalendarController exportCalendarController;

    /**
     * Constructs an ExportCalendarPresenter with the specified ExportCalendarController.
     *
     * @param exportCalendarController the controller responsible for managing the export logic.
     */
    public ExportCalendarPresenter(ExportCalendarController exportCalendarController) {
        this.exportCalendarController = exportCalendarController;
    }

    /**
     * Handles the export action by invoking the controller to perform the export process.
     */
    public void handleExportAction() {
        exportCalendarController.handleExport();
    }
}
