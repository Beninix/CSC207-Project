package view;

import app.BuildAppWindow;

import javax.swing.*;

import static app.BuildAppWindow.*;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class SearchView extends JPanel{

    public SearchView() {

        buttonsPanelVisible();

        buttonUnclickable(searchButton);
        buttonClickable(homeButton);
        buttonClickable(calendarButton);
        buttonClickable(bookmarksButton);
        buttonClickable(settingsButton);
        buttonClickable(logoutButton);

        JLabel jlabel = new JLabel("Search for recipes");
        this.add(jlabel);
    }

}
