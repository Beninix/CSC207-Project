package view;

import app.BuildAppWindow;

import javax.swing.*;

import static app.BuildAppWindow.*;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class LoginView extends JPanel{

    private static JTextField searchInputField = new JTextField(100);
    private static JButton loginButton = new JButton("Login");

    public LoginView() {
        buttonsPanelInvisible(buttonsPanel);

//        buttonInvisible(BuildAppWindow.searchButton);
//        buttonInvisible(BuildAppWindow.homeButton);
//        buttonInvisible(BuildAppWindow.calendarButton);
//        buttonInvisible(BuildAppWindow.bookmarksButton);
//        buttonInvisible(BuildAppWindow.settingsButton);
//        buttonInvisible(BuildAppWindow.logoutButton);

        this.add(loginButton);
    }

}
