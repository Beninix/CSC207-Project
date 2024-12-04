package interface_adapter.navigation;

import interface_adapter.ViewManagerModel;
import interface_adapter.change_password.LoggedInViewModel;
import interface_adapter.login.LoginViewModel;
import interface_adapter.recipe_collection.RecipeCollectionViewModel;
import interface_adapter.search.SearchViewModel;
import interface_adapter.signup.SignupViewModel;
import use_case.navigation.NavOutputBoundary;

public class NavPresenter implements NavOutputBoundary {
    private final SearchViewModel searchViewModel;
    private final RecipeCollectionViewModel recipeCollectionViewModel;
    private final LoggedInViewModel loggedInViewModel;
    private final LoginViewModel loginViewModel;
    private final ViewManagerModel viewManagerModel;

    public NavPresenter(ViewManagerModel viewManagerModel,
                            SearchViewModel searchViewModel,
                            RecipeCollectionViewModel recipeCollectionViewModel,
                            LoggedInViewModel loggedInViewModel,
                            LoginViewModel loginViewModel
                        ) {
        this.viewManagerModel = viewManagerModel;
        this.searchViewModel = searchViewModel;
        this.recipeCollectionViewModel = recipeCollectionViewModel;
        this.loggedInViewModel = loggedInViewModel;
        this.loginViewModel = loginViewModel;
    }

    /**
     * Switches to Search View.
     */
    @Override
    public void switchToSearchView() {
        viewManagerModel.setState(searchViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    /**
     * Switches to the Recipe Collection View.
     */
    @Override
    public void switchToRecipeCollectionView() {
        viewManagerModel.setState(recipeCollectionViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    /**
     * Switches to the Change Password View.
     */
    @Override
    public void switchToChangePasswordView() {
        viewManagerModel.setState(loggedInViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }
}
