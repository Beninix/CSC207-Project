package interface_adapter.navigation;

import interface_adapter.ViewModel;

/**
 * The ViewModel for the Navigation.
 */
public class NavViewModel extends ViewModel<NavState> {

    public static final String SEARCH_BUTTON_LABEL = "Search";
    public static final String RECIPECOLLECTION_BUTTON_LABEL = "Recipe Collection";
    public static final String CHANGEPASSWORD_BUTTON_LABEL = "Change Password";
    public static final String LOGOUT_BUTTON_LABEL = "Logout";

    public NavViewModel() {
        super("navigation");
        setState(new NavState());
    }

}
