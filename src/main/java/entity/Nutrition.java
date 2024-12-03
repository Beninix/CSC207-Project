package entity;

public class Nutrition {
    int calories;
    int fat;
    int cholesterol;
    int sodium;
    int fiber;
    int sugar;
    int protein;

    public Nutrition(int calories, int protein, int sugar, int fiber, int sodium, int cholesterol, int fat) {
        this.calories = calories;
        this.protein = protein;
        this.sugar = sugar;
        this.fiber = fiber;
        this.sodium = sodium;
        this.cholesterol = cholesterol;
        this.fat = fat;
    }
    public void printNutrition(){
        System.out.println("Calories: " + calories);
        System.out.println("Protein: " + protein);
        System.out.println("Sugar: " + sugar);
        System.out.println("Fiber: " + fiber);
        System.out.println("Sodium: " + sodium);
        System.out.println("Cholesterol: " + cholesterol);
        System.out.println("Fat: " + fat);
    }

    public String toString(){
        return "Calories: " + calories +
                ", Protein: " + protein +
                "g, Sugar: " + sugar +
                "g, Fiber: " + fiber +
                "mg, Sodium: " + sodium +
                "mg, Cholesterol: " + cholesterol +
                "g, Fat: " + fat + "g";
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