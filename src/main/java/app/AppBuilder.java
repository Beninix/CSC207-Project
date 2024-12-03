package app;

import java.awt.CardLayout;

import javax.swing.*;

import data_access.InMemoryUserDataAccessObject;
import entity.CommonUserFactory;
import entity.UserFactory;
import interface_adapter.ViewManagerModel;
import interface_adapter.calendar.CalendarViewModel;
import interface_adapter.change_password.ChangePasswordController;
import interface_adapter.change_password.ChangePasswordPresenter;
import interface_adapter.change_password.LoggedInViewModel;
import interface_adapter.login.LoginController;
import interface_adapter.login.LoginPresenter;
import interface_adapter.login.LoginViewModel;
import interface_adapter.logout.LogoutController;
import interface_adapter.logout.LogoutPresenter;
import interface_adapter.navigation.NavViewModel;
import interface_adapter.recipe.RecipeViewModel;
import interface_adapter.recipe_collection.RecipeCollectionViewModel;
import interface_adapter.search.SearchViewModel;
import interface_adapter.signup.SignupController;
import interface_adapter.signup.SignupPresenter;
import interface_adapter.signup.SignupViewModel;
import use_case.change_password.ChangePasswordInputBoundary;
import use_case.change_password.ChangePasswordInteractor;
import use_case.change_password.ChangePasswordOutputBoundary;
import use_case.login.LoginInputBoundary;
import use_case.login.LoginInteractor;
import use_case.login.LoginOutputBoundary;
import use_case.logout.LogoutInputBoundary;
import use_case.logout.LogoutInteractor;
import use_case.logout.LogoutOutputBoundary;
import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInteractor;
import use_case.signup.SignupOutputBoundary;
import view.*;
import interface_adapter.export_calendar.ExportCalendarController;

/**
 * The AppBuilder class is responsible for putting together the pieces of
 * our CA architecture; piece by piece.
 * <p/>
 * This is done by adding each View and then adding related Use Cases.
 */
// Checkstyle note: you can ignore the "Class Data Abstraction Coupling"
//                  and the "Class Fan-Out Complexity" issues for this lab; we encourage
//                  your team to think about ways to refactor the code to resolve these
//                  if your team decides to work with this as your starter code
//                  for your final project this term.
public class AppBuilder {
    private final JPanel cardPanel = new JPanel();
    private final CardLayout cardLayout = new CardLayout();
    // thought question: is the hard dependency below a problem?
    private final UserFactory userFactory = new CommonUserFactory();
    private final ViewManagerModel viewManagerModel = new ViewManagerModel();
    private final ViewManager viewManager = new ViewManager(cardPanel, cardLayout, viewManagerModel);

    // thought question: is the hard dependency below a problem?
    private final InMemoryUserDataAccessObject userDataAccessObject = new InMemoryUserDataAccessObject();

    private NavigationMenu navigationMenu;
    private NavViewModel navViewModel;
    private SignupView signupView;
    private SignupViewModel signupViewModel;
    private LoginViewModel loginViewModel;
    private LoggedInViewModel loggedInViewModel;
    private LoggedInView loggedInView;
    private LoginView loginView;
    private CalendarView calendarView;
    private CalendarViewModel calendarViewModel;
    private RecipeCollectionView recipeCollectionView;
    private RecipeCollectionViewModel recipeCollectionViewModel;
    private RecipeView recipeView;
    private RecipeViewModel recipeViewModel;
    private SearchView searchView;
    private SearchViewModel searchViewModel;
    private LoggedInView changePasswordView;
    private LoggedInViewModel changePasswordViewModel;
    private ExportCalendarController exportCalendarController;

    public AppBuilder() {
        cardPanel.setLayout(cardLayout);
    }

    /**
     * Adds the Navigation Menu to the application.
     * @return this builder
     */
    public JMenuBar addNavigationMenu() {
        navViewModel = new NavViewModel();
        navigationMenu = new NavigationMenu(navViewModel);
        return navigationMenu;
    }

    /**
     * Adds the Signup View to the application.
     * @return this builder
     */
    public AppBuilder addSignupView() {
        signupViewModel = new SignupViewModel();
        signupView = new SignupView(signupViewModel);
        cardPanel.add(signupView, signupView.getViewName());
        return this;
    }

    /**
     * Adds the Login View to the application.
     * @return this builder
     */
    public AppBuilder addLoginView() {
        loginViewModel = new LoginViewModel();
        loginView = new LoginView(loginViewModel);
        cardPanel.add(loginView, loginView.getViewName());
        return this;
    }

    /**
     * Adds the LoggedIn View to the application.
     * @return this builder
     */
    public AppBuilder addLoggedInView() {
        loggedInViewModel = new LoggedInViewModel();
        loggedInView = new LoggedInView(loggedInViewModel, exportCalendarController);
        loggedInView.setExportCalendarController(exportCalendarController); // Ensure the controller is set

        cardPanel.add(loggedInView, loggedInView.getViewName());
        return this;
    }

    /**
     * Adds the Calendar View to the application.
     * @return this builder
     */
    public AppBuilder addCalendarView() {
        calendarViewModel = new CalendarViewModel();
        calendarView = new CalendarView(calendarViewModel);
        cardPanel.add(calendarView, calendarView.getViewName());
        return this;
    }

    /**
     * Adds the Recipe View to the application.
     * @return this builder
     */
    public AppBuilder addRecipeView() {
        recipeViewModel = new RecipeViewModel();
        recipeView = new RecipeView(recipeViewModel, null);
        cardPanel.add(recipeView, recipeView.getViewName());
        return this;
    }

    /**
     * Adds the Recipe Collection View to the application.
     * @return this builder
     */
    public AppBuilder addRecipeCollectionView() {
        recipeCollectionViewModel = new RecipeCollectionViewModel();
        recipeCollectionView = new RecipeCollectionView(recipeCollectionViewModel);
        cardPanel.add(recipeCollectionView, recipeCollectionView.getViewName());
        return this;
    }

    /**
     * Adds the Search View to the application.
     * @return this builder
     */
    public AppBuilder addSearchView() {
        searchViewModel = new SearchViewModel();
        searchView = new SearchView(searchViewModel);
        cardPanel.add(searchView, searchView.getViewName());
        return this;
    }

    /**
     * Adds the Change Password View to the application.
     * @return this builder
     */
    public AppBuilder addChangePasswordView() {
        changePasswordViewModel = new LoggedInViewModel();
        changePasswordView = new LoggedInView(changePasswordViewModel,exportCalendarController );
        cardPanel.add(changePasswordView, changePasswordView.getViewName());
        return this;
    }


    /**
     * Adds the Signup Use Case to the application.
     * @return this builder
     */
    public AppBuilder addSignupUseCase() {
        final SignupOutputBoundary signupOutputBoundary = new SignupPresenter(viewManagerModel,
                signupViewModel, loginViewModel);
        final SignupInputBoundary userSignupInteractor = new SignupInteractor(
                userDataAccessObject, signupOutputBoundary, userFactory);

        final SignupController controller = new SignupController(userSignupInteractor);
        signupView.setSignupController(controller);
        return this;
    }

    /**
     * Adds the Login Use Case to the application.
     * @return this builder
     */
    public AppBuilder addLoginUseCase() {
        final LoginOutputBoundary loginOutputBoundary = new LoginPresenter(viewManagerModel,
                loggedInViewModel, loginViewModel);
        final LoginInputBoundary loginInteractor = new LoginInteractor(
                userDataAccessObject, loginOutputBoundary);

        final LoginController loginController = new LoginController(loginInteractor);
        loginView.setLoginController(loginController);
        return this;
    }

    /**
     * Adds the Change Password Use Case to the application.
     * @return this builder
     */
    public AppBuilder addChangePasswordUseCase() {
        final ChangePasswordOutputBoundary changePasswordOutputBoundary =
                new ChangePasswordPresenter(loggedInViewModel);

        final ChangePasswordInputBoundary changePasswordInteractor =
                new ChangePasswordInteractor(userDataAccessObject, changePasswordOutputBoundary, userFactory);

        final ChangePasswordController changePasswordController =
                new ChangePasswordController(changePasswordInteractor);
        loggedInView.setChangePasswordController(changePasswordController);
        return this;
    }

    /**
     * Adds the Logout Use Case to the application.
     * @return this builder
     */
    public AppBuilder addLogoutUseCase() {
        final LogoutOutputBoundary logoutOutputBoundary = new LogoutPresenter(viewManagerModel,
                loggedInViewModel, loginViewModel);

        final LogoutInputBoundary logoutInteractor =
                new LogoutInteractor(userDataAccessObject, logoutOutputBoundary);

        final LogoutController logoutController = new LogoutController(logoutInteractor);
        loggedInView.setLogoutController(logoutController);
        return this;
    }

    public void setMenuVisible(Boolean bool) {
        navigationMenu.setVisible(bool);
    }

    /**
     * Creates the JFrame for the application and initially sets the SignupView to be displayed.
     * @return the application
     */
    public JFrame build() {
        final JFrame application = new JFrame("BiteWise");
        application.setSize(ViewConstants.PANELWIDTH, ViewConstants.PANELHEIGHT);
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        application.setJMenuBar(addNavigationMenu());
        application.add(cardPanel);

        viewManagerModel.setState(signupView.getViewName());
        viewManagerModel.firePropertyChanged();

        return application;
    }
}
