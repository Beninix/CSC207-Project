package interface_adapter.navigation;

import use_case.navigation.NavInputBoundary;
import use_case.navigation.NavInputData;

/**
 * The controller for the Navigation Use Case.
 */
public class NavController {
    private final NavInputBoundary navUseCaseInteractor;

    public NavController(NavInputBoundary navUseCaseInteractor) {
        this.navUseCaseInteractor = navUseCaseInteractor;
    }

    /**
     * Executes the Navigation Use Case.
     * @param buttonClicked the button that the user clicked.
     */
    public void execute(String buttonClicked) {
        final NavInputData navInputData = new NavInputData(buttonClicked);
        navUseCaseInteractor.execute(navInputData);
    }

    /**
     * Executes the "switch to Search" Use Case.
     */
    public void switchToSearchView() {
        navUseCaseInteractor.switchToSearchView();
    }

    /**
     * Executes the "switch to RecipeCollection" Use Case.
     */
    public void switchToRecipeCollectionView() {
        navUseCaseInteractor.switchToRecipeCollectionView();
    }

    /**
     * Executes the "switch to ChangePassword" Use Case.
     */
    public void switchToChangePasswordView() {
        navUseCaseInteractor.switchToChangePasswordView();
    }

}
