package view;

import app.BuildAppWindow;

import javax.swing.*;

import static app.BuildAppWindow.*;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class SettingsView extends JPanel{

    public SettingsView() {
        buttonsPanelVisible();

        buttonClickable(searchButton);
        buttonClickable(homeButton);
        buttonClickable(calendarButton);
        buttonClickable(bookmarksButton);
        buttonUnclickable(settingsButton);
        buttonClickable(logoutButton);
    }

}
