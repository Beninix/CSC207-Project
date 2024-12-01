package use_case.navigation;

import use_case.login.LoginInputData;

/**
 * Input Boundary for actions which are related to navigating through the menu.
 */
public interface NavInputBoundary {
    /**
     * Executes the navigation use case.
     * @param navInputData the input data
     */
    void execute(NavInputData navInputData);

    /**
     * Executes the switch to search view use case.
     */
    void switchToSearchView();

    /**
     * Executes the switch to recipe collection view use case.
     */
    void switchToRecipeCollectionView();

    /**
     * Executes the switch to change password view use case.
     */
    void switchToChangePasswordView();

}
