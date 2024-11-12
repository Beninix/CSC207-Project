package view;

import app.BuildAppWindow;

import javax.swing.*;

import static app.BuildAppWindow.*;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class CalendarView extends JPanel{

    public CalendarView() {

        buttonsPanelVisible();

        buttonClickable(searchButton);
        buttonClickable(homeButton);
        buttonUnclickable(calendarButton);
        buttonClickable(bookmarksButton);
        buttonClickable(settingsButton);
        buttonClickable(logoutButton);
    }

}
