package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {

    private String username;

    public String getUsername() {
        return username;
    }

    public void resetUsername() {
        this.username = null;
    }

    public LogoutInputData(String username) {
        // TODO: (DONE) save the current username in an instance variable and add a getter.
        this.username = username;
    }

}