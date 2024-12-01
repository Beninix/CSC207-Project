package use_case.navigation;

public class NavInputData {
    final String button_clicked;
    public NavInputData(String button_clicked) {
        this.button_clicked = button_clicked;
    }
    public String getButton_clicked() {
        return button_clicked;
    }
}
