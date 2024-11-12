package view;

import app.BuildAppWindow;

import javax.swing.*;

import static app.BuildAppWindow.*;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class BookmarksView extends JPanel{

    public BookmarksView() {
        buttonsPanelVisible();

        buttonClickable(searchButton);
        buttonClickable(homeButton);
        buttonClickable(calendarButton);
        buttonUnclickable(bookmarksButton);
        buttonClickable(settingsButton);
        buttonClickable(logoutButton);
    }

}
