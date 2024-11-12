package view;

import app.BuildAppWindow;

import javax.swing.*;

import java.awt.*;

import static app.BuildAppWindow.*;

/**
 * The LoginView for when the user has just started the program, and not logged in.
 */
public class LoginView extends JPanel{

    private static JLabel loginInputLabel = new JLabel("Username: ");
    private static JTextField loginInputField = new JTextField(25);
    private static JLabel passwordInputLabel = new JLabel("Password: ");
    private static JTextField passwordInputField = new JTextField(25);
    private static JButton loginButton = new JButton("Login");

    private static JButton createAccountButton = new JButton("Create new account");

    public LoginView() {
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
