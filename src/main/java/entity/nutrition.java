public class nutrition {
    int calories;
    int fat;
    int cholesterol;
    int sodium;
    int fiber;
    int sugar;
    int protein;

    public nutrition(int calories, int protein, int sugar, int fiber, int sodium, int cholesterol, int fat) {
        this.calories = calories;
        this.protein = protein;
        this.sugar = sugar;
        this.fiber = fiber;
        this.sodium = sodium;
        this.cholesterol = cholesterol;
        this.fat = fat;
    }

    public int getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getFiber() {
        return fiber;
    }

    public void setFiber(int fiber) {
        this.fiber = fiber;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

}