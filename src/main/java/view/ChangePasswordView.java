package view;

import interface_adapter.calendar.CalendarViewModel;
import interface_adapter.change_password.LoggedInViewModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

/**
 * SettingsView for when the user is logged into the program.
 */
public class ChangePasswordView extends JPanel implements ActionListener, PropertyChangeListener {

    private final String viewName = "change password";

    public ChangePasswordView(LoggedInViewModel loggedInViewModel) {

    }

    public String getViewName() { return viewName; }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }


    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @Override
    public void propertyChange(PropertyChangeEvent evt) {

    }
}
