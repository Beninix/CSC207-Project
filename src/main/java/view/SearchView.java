package view;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import interface_adapter.search.SearchState;
import interface_adapter.search.SearchViewModel;

/**
 * SearchView for when the user is logged into the program.
 */
public class SearchView extends JPanel implements ActionListener, PropertyChangeListener {
    private final String viewName = "search";
    private final SearchViewModel searchViewModel;

    @SuppressWarnings({"checkstyle:UnusedLocalVariable", "checkstyle:SuppressWarnings", "checkstyle:ExecutableStatementCount"})
    public SearchView(SearchViewModel searchViewModel) {
        this.searchViewModel = searchViewModel;

        // Labels and panels
        final JPanel searchPanel;
        final JButton searchButton = new JButton("Search");

        final JPanel ingredientsPanel = new JPanel();
        final JPanel dietsPanel = new JPanel();
        final JPanel cookingTimePanel = new JPanel();
        final JPanel caloriesPanel = new JPanel();

        final JLabel ingredientsLabel = new JLabel("Ingredients (, separated)");
        final JLabel dietsLabel = new JLabel("Diets");
        final JLabel cookingTimeLabel = new JLabel("Cooking Time");
        final JLabel caloriesLabel = new JLabel("Calories");

        ingredientsPanel.add(ingredientsLabel);
        dietsPanel.add(dietsLabel);
        cookingTimePanel.add(cookingTimeLabel);
        caloriesPanel.add(caloriesLabel);

        searchPanel = new JPanel();
        searchPanel.setLayout(new BoxLayout(searchPanel, BoxLayout.Y_AXIS));
        searchPanel.add(new JLabel("Search"));
        this.add(searchPanel);
        searchPanel.add(ingredientsPanel);
        searchPanel.add(dietsPanel);
        searchPanel.add(cookingTimePanel);
        searchPanel.add(caloriesPanel);

        // Ingredients input
        final JTextField ingredientsInputField = new JTextField(15);
        ingredientsPanel.add(ingredientsInputField);

        // Diets input
        final JRadioButton veganRadioButton = new JRadioButton("Vegan");
        final JRadioButton vegetarianRadioButton = new JRadioButton("Vegetarian");
        final JRadioButton glutenFreeRadioButton = new JRadioButton("Gluten Free");
        final JRadioButton dairyFreeRadioButton = new JRadioButton("Dairy Free");
        final JRadioButton sustainableRadioButton = new JRadioButton("Sustainable");
        final JRadioButton cheapRadioButton = new JRadioButton("Cheap");
        dietsPanel.add(veganRadioButton);
        dietsPanel.add(vegetarianRadioButton);
        dietsPanel.add(glutenFreeRadioButton);
        dietsPanel.add(dairyFreeRadioButton);
        dietsPanel.add(sustainableRadioButton);
        dietsPanel.add(cheapRadioButton);

        // Cooking time input
        final JTextField cookingTimeInputField = new JTextField(15);
        cookingTimePanel.add(cookingTimeInputField);

        // Calories input
        final JTextField caloriesInputField = new JTextField(15);
        caloriesPanel.add(caloriesInputField);

        final JPanel results = new JPanel();
    }

    public String getViewName() {
        return viewName;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    /**
     * Main.
     * @param args String
     */
    @SuppressWarnings({"checkstyle:UncommentedMain", "checkstyle:SuppressWarnings"})
    public static void main(String[] args) {
        final JFrame application = new JFrame("LogiEEEEEEmple");
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.setLayout(new CardLayout());
        final SearchView searchView = new SearchView(new SearchViewModel());
        application.add(searchView, searchView.getViewName());
        application.setVisible(true);
        application.pack();
    }

    /**
     * This method gets called when a bound property is changed.
     *
     * @param evt A PropertyChangeEvent object describing the event source
     *            and the property that has changed.
     */
    @SuppressWarnings({"checkstyle:UnusedLocalVariable", "checkstyle:SuppressWarnings"})
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        final SearchState state = (SearchState) evt.getNewValue();
    }
}
