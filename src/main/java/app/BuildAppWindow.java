package app;

import view.ConstantsView;

import javax.swing.*;
import java.awt.*;

public class BuildAppWindow {

    public static JPanel buttonsPanel = new JPanel();

    public static JButton logoutButton = new JButton("Logout");
    public static JButton bookmarksButton = new JButton("Bookmarks");
    public static JButton settingsButton = new JButton("Settings");
    public static JButton calendarButton = new JButton("Calendar");
    public static JButton searchButton = new JButton("Search");
    public static JButton homeButton = new JButton("Home");


//    public BuildAppWindow() {
//        final JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setTitle("Bite Wise");
//        frame.setSize(ConstantsView.PANELWIDTH, ConstantsView.PANELHEIGHT);
//
//        // frame.add(view, BorderLayout.CENTER);
//        frame.setVisible(true);
//    }
    public BuildAppWindow(JPanel view) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Bite Wise");
        frame.setSize(ConstantsView.PANELWIDTH, ConstantsView.PANELHEIGHT);

        frame.add(buttonsPanel(), BorderLayout.NORTH);
        frame.add(view, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public JPanel buttonsPanel() {

        buttonsPanel.setBorder(BorderFactory.createEmptyBorder());

        buttonsPanel.add(homeButton);
        buttonsPanel.add(searchButton);
        buttonsPanel.add(calendarButton);
        buttonsPanel.add(bookmarksButton);
        buttonsPanel.add(settingsButton);
        buttonsPanel.add(logoutButton);

        return buttonsPanel;
    }

    public static void buttonUnclickable(JButton button){
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
    }

    public static void buttonClickable(JButton button){
        button.setOpaque(true);
        button.setContentAreaFilled(true);
        button.setBorderPainted(true);
        button.setFocusPainted(true);
    }

    public static void buttonInvisible(JButton button){
        button.setVisible(false);
    }

    public static void buttonVisible(JButton button){
        button.setVisible(true);
    }

    public static void buttonsPanelInvisible(JPanel panel){
        panel.setVisible(false);
    }

    public static void buttonsPanelVisible(JPanel panel){
        panel.setVisible(true);
    }


}
