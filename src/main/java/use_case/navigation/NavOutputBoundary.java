package use_case.navigation;

public interface NavOutputBoundary {

    /**
     * Switches to the Search View.
     */
    void switchToSearchView();

    /**
     * Switches to the Recipe Collection View.
     */
    void switchToRecipeCollectionView();

    /**
     * Switches to the Change Password View.
     */
    void switchToChangePasswordView();

}
