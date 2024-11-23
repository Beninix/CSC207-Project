package use_case.note.Logout;

import interface_adapter.logout.LogoutInputBoundary;

/**
 * The controller for the Logout Use Case.
 */
public class LogoutController {

    private final LogoutInputBoundary logoutUseCaseInteractor;

    public LogoutController(LogoutInputBoundary logoutUseCaseInteractor) {
        this.logoutUseCaseInteractor = logoutUseCaseInteractor;
    }

    /**
     * Executes the Logout Use Case.
     * @param username the username of the user logging out
     */
    public void execute(String username) {
        final LogoutInputData inputData = new LogoutInputData(username);

        logoutUseCaseInteractor.execute(inputData);
    }
}