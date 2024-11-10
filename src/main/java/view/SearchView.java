package view;

import javax.swing.*;
import java.awt.*;

import static view.BuildAppWindow.*;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class SearchView extends JPanel{

    public SearchView() {
        buttonUnclickable(BuildAppWindow.searchButton);
        buttonClickable(BuildAppWindow.homeButton);
        buttonClickable(BuildAppWindow.calendarButton);
        buttonClickable(BuildAppWindow.bookmarksButton);
        buttonClickable(BuildAppWindow.settingsButton);
        buttonClickable(BuildAppWindow.logoutButton);
    }

}
