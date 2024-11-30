package view;

import app.AppBuilder;
import interface_adapter.login.LoginState;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Navigation menu to the application
 */
public class NavigationMenu extends JMenuBar implements ActionListener {

    private final JButton buttonSearch = new JButton("Search");
    private final JButton buttonRecipeCollection = new JButton("Recipe Collection");
    private final JButton buttonChangePassword = new JButton("Change Password");
    private final JButton buttonLogout = new JButton("Logout");

    public NavigationMenu() {
        this.add(buttonSearch);
        this.add(buttonRecipeCollection);
        this.add(buttonChangePassword);
        this.add(buttonLogout);
        this.setVisible(true);
    }

    /**
    * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

//    buttonSearch.addActionListener(
//        new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//            signupController.switchToLoginView();
//        }
//    }
//    );
//
//    cancel.addActionListener(this);



    /**
     * Testing menu bar
     * @param args
     */
    public static void main(String[] args) {
        NavigationMenu navigationMenu = new NavigationMenu();
        JFrame jframe = new JFrame();
        jframe.setSize(600,400);
        navigationMenu.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setJMenuBar(navigationMenu);
        jframe.setVisible(true);
    }

}
