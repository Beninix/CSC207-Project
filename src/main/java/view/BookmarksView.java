package view;

import app.BuildAppWindow;

import javax.swing.*;

import static app.BuildAppWindow.buttonClickable;
import static app.BuildAppWindow.buttonUnclickable;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class BookmarksView extends JPanel{

    public BookmarksView() {
        buttonClickable(BuildAppWindow.searchButton);
        buttonClickable(BuildAppWindow.homeButton);
        buttonClickable(BuildAppWindow.calendarButton);
        buttonUnclickable(BuildAppWindow.bookmarksButton);
        buttonClickable(BuildAppWindow.settingsButton);
        buttonClickable(BuildAppWindow.logoutButton);
    }

}
