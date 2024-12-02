package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JPanel;

import interface_adapter.recipeCollection.RecipeCollectionViewModel;

/**
 * RecipeCollectionView for when the user is logged into the program.
 */
public class RecipeCollectionView extends JPanel implements ActionListener, PropertyChangeListener {

    private final String viewName = "recipe collection";

    public RecipeCollectionView(RecipeCollectionViewModel recipeCollectionViewModel) {

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
