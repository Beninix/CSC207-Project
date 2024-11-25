package app;

import javax.swing.*;

/**
 * The Main class of our application.
 */
public class MainApplication {
    /**
     * Builds and runs the CA architecture of the application.
     * @param args unused arguments
     */
    public static void main(String[] args) {
        final AppBuilder appBuilder = new AppBuilder();
        // TODO: add the Logout Use Case to the app using the appBuilder
        final JFrame application = appBuilder
                                            .addLoginView()
                                            .addSignupView()
                                            .addLoggedInView()
                                            .addCalendarView()
                                            .addRecipeView()
                                            .addRecipeCollectionView()
                                            .addSearchView()
                                            .addSignupUseCase()
                                            .addLoginUseCase()
                                            .addChangePasswordUseCase()
                                            // add your use case here
                                            .build();

        application.pack();
        application.setVisible(true);
    }
}
