package view;

import app.AppBuilder;
import interface_adapter.login.LoginState;
import interface_adapter.navigation.NavController;
import interface_adapter.navigation.NavViewModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Navigation menu to the application
 */
public class NavigationMenu extends JMenuBar implements ActionListener {

    private final JButton buttonSearch = new JButton("Search");
    private final JButton buttonRecipeCollection = new JButton("Recipe Collection");
    private final JButton buttonChangePassword = new JButton("Change Password");
    private final JButton buttonLogout = new JButton("Logout");
    private NavController navController;

    public NavigationMenu(NavViewModel navViewModel) {
        this.add(buttonSearch);
        this.add(buttonRecipeCollection);
        this.add(buttonChangePassword);
        this.add(buttonLogout);
        this.setVisible(true);


//        /**
//         * Invoked when an action occurs.
//         *
//         * @param e the event to be processed
//         */
//        @Override
//        public void actionPerformed(ActionEvent e){
//
//        }
//
//        buttonSearch.addActionListener(
//                new ActionListener() {
//                    public void actionPerformed(ActionEvent e) {
//                        navController.switchToSearchView();
//                    }
//                }
//        );

    }

    /**
     * Testing menu bar
     * @param args
     */
    public static void main (String[]args){
        NavigationMenu navigationMenu = new NavigationMenu(new NavViewModel());
        JFrame jframe = new JFrame();
        jframe.setSize(600, 400);
        navigationMenu.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setJMenuBar(navigationMenu);
        jframe.setVisible(true);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
