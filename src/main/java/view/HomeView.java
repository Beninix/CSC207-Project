package view;

import javax.swing.*;

import static view.BuildAppWindow.buttonClickable;
import static view.BuildAppWindow.buttonUnclickable;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class HomeView extends JPanel{

    public HomeView() {
        buttonClickable(BuildAppWindow.searchButton);
        buttonUnclickable(BuildAppWindow.homeButton);
        buttonClickable(BuildAppWindow.calendarButton);
        buttonClickable(BuildAppWindow.bookmarksButton);
        buttonClickable(BuildAppWindow.settingsButton);
        buttonClickable(BuildAppWindow.logoutButton);
    }

}
