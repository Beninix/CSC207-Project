package use_case.note;

import entity.User;

/**
 * The "Use Case Interactor" for our two note-related use cases of refreshing
 * the contents of the note and saving the contents of the note. Since they
 * are closely related, we have combined them here for simplicity.
 */
public class NoteInteractor implements NoteInputBoundary {

    private final NoteDataAccessInterface noteDataAccessInterface;
    private final NoteOutputBoundary noteOutputBoundary;
    // Note: this program has it hardcoded which user object it is getting data for;
    // you could change this if you wanted to generalize the code. For example,
    // you might allow a user of the program to create a new note, which you
    // could store as a "user" through the API OR you might maintain all notes
    // in a JSON object stored in one common "user" stored through the API.
    private final User user = new User("jonathan_calver2", "abc123");

    public NoteInteractor(NoteDataAccessInterface noteDataAccessInterface,
                          NoteOutputBoundary noteOutputBoundary) {
        this.noteDataAccessInterface = noteDataAccessInterface;
        this.noteOutputBoundary = noteOutputBoundary;
    }

    /**
     * Executes the refresh note use case.
     *
     */
    @Override
    public void executeRefresh() {
        try {

            final String note = noteDataAccessInterface.loadNote(user);
            noteOutputBoundary.prepareSuccessView(note);
        }
        catch (DataAccessException ex) {
            noteOutputBoundary.prepareFailView(ex.getMessage());
        }
    }

    /**
     * Executes the save note use case.
     *
     * @param note the input data
     */
    @Override
    public void executeSave(String note) {
        try {

            final String updatedNote = noteDataAccessInterface.saveNote(user, note);
            noteOutputBoundary.prepareSuccessView(updatedNote);
        }
        catch (DataAccessException ex) {
            noteOutputBoundary.prepareFailView(ex.getMessage());
        }
    }
}
