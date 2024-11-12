package view;

import app.BuildAppWindow;

import javax.swing.*;

import static app.BuildAppWindow.*;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class HomeView extends JPanel{

    public HomeView() {
        buttonsPanelVisible();

        buttonClickable(searchButton);
        buttonUnclickable(homeButton);
        buttonClickable(calendarButton);
        buttonClickable(bookmarksButton);
        buttonClickable(settingsButton);
        buttonClickable(logoutButton);
    }

}
