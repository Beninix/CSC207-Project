package view;

import javax.swing.*;

import static view.BuildAppWindow.buttonClickable;
import static view.BuildAppWindow.buttonUnclickable;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class SettingsView extends JPanel{

    public SettingsView() {
        buttonClickable(BuildAppWindow.searchButton);
        buttonClickable(BuildAppWindow.homeButton);
        buttonClickable(BuildAppWindow.calendarButton);
        buttonClickable(BuildAppWindow.bookmarksButton);
        buttonUnclickable(BuildAppWindow.settingsButton);
        buttonClickable(BuildAppWindow.logoutButton);
    }

}
