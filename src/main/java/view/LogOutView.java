package view;

import javax.swing.*;

import static app.BuildAppWindow.buttonsPanelInvisible;

/**
 * The LoginOut for when the user wants to logout of the program.
 */
public class LogOutView extends JPanel{

    private static JLabel loginInputLabel = new JLabel("Username: ");
    private static JTextField loginInputField = new JTextField(25);
    private static JLabel passwordInputLabel = new JLabel("Password: ");
    private static JTextField passwordInputField = new JTextField(25);
    private static JButton loginButton = new JButton("Login");

    private static JButton createAccountButton = new JButton("Create new account");

    public LogOutView() {
        buttonsPanelInvisible();
        this.setLayout(null);
        loginInputLabel.setBounds(10,20,80,25);
        loginInputField.setBounds(100,20,165,25);
        passwordInputLabel.setBounds(10,20,80,25);

        this.add(loginInputLabel);
        this.add(loginInputField);
//        this.add(loginButton);
//        this.add(createAccountButton);
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

}
