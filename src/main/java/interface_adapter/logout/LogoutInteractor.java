package interface_adapter.logout;

import entity.User;
// import use_case.change_password.ChangePasswordOutputData;
import interface_adapter.login.LoginOutputData;

/**
 * The Logout Interactor.
 */
public class LogoutInteractor implements LogoutInputBoundary {
    private LogoutUserDataAccessInterface userDataAccessObject;
    private LogoutOutputBoundary logoutPresenter;

    public LogoutInteractor(LogoutUserDataAccessInterface userDataAccessInterface,
                            LogoutOutputBoundary logoutOutputBoundary) {
        // TODO: (DONE) save the DAO and Presenter in the instance variables.
        userDataAccessObject = userDataAccessInterface;
        logoutPresenter = logoutOutputBoundary;
        // Which parameter is the DAO and which is the presenter?
    }

    @Override
    public void execute(LogoutInputData logoutInputData) {
        // TODO: implement the logic of the Logout Use Case,
        // (depends on the LogoutInputData.java TODO)
        // * get the username out of the input data,
        // * set the username to null in the DAO
        // * instantiate the `LogoutOutputData`, which needs to contain the username.
        // * tell the presenter to prepare a success view.
        final String user = logoutInputData.getUsername();

        userDataAccessObject.setCurrentUsername(null);
        final LogoutOutputData logoutOutputData = new LogoutOutputData(user, false);
        logoutPresenter.prepareSuccessView(logoutOutputData);
    }
}