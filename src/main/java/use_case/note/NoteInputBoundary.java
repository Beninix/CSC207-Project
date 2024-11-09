package use_case.note;

/**
 * The Input Boundary for our note-related use cases. Since they are closely related,
 * we have included them both in the same interface for simplicity.
 */
public interface NoteInputBoundary {

    /**
     * Executes the refresh note use case.
     */
    void executeRefresh();

    /**
     * Executes the save note use case.
     * @param message the input data
     */
    void executeSave(String message);
}
