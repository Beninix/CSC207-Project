package view;

import javax.swing.*;
import java.awt.*;

public class BuildAppWindow {

    JPanel jpanel;

    JPanel panel = new JPanel();
    private static JLabel windowName = new JLabel("Search");
    private static JTextField searchInputField = new JTextField(100);
    private static JButton loginButton = new JButton("Login");
    protected static JButton logoutButton = new JButton("Logout");
    protected static JButton bookmarksButton = new JButton("Bookmarks");
    protected static JButton settingsButton = new JButton("Settings");
    protected static JButton calendarButton = new JButton("Calendar");
    protected static JButton searchButton = new JButton("Search");
    protected static JButton homeButton = new JButton("Home");


    public BuildAppWindow() {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Bite Wise");
        frame.setSize(ConstantsView.PANELWIDTH, ConstantsView.PANELHEIGHT);

        // frame.add(view, BorderLayout.CENTER);
        frame.setVisible(true);
    }
    public BuildAppWindow(JPanel view) {
        final JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Bite Wise");
        frame.setSize(ConstantsView.PANELWIDTH, ConstantsView.PANELHEIGHT);

        frame.add(buttonsPanel(), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public JPanel buttonsPanel() {
        // setSize(ConstantsView.PANELWIDTH,ConstantsView.PANELHEIGHT);
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder());
        // buttonsPanel.setLayout(new GridLayout(10,2));

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

}
