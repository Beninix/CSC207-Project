public class day {
    private Recipe breakfast;
    private Recipe lunch;
    private Recipe dinner;

    public day(Recipe breakfast, Recipe lunch, Recipe dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }

    public Recipe getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Recipe breakfast) {
        this.breakfast = breakfast;
    }

    public Recipe getLunch() {
        return lunch;
    }

    public void setLunch(Recipe lunch) {
        this.lunch = lunch;
    }

    public Recipe getDinner() {
        return dinner;
    }

    public void setDinner(Recipe dinner) {
        this.dinner = dinner;
    }
}