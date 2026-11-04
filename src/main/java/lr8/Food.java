package lr8;

public class Food {
    private String name;
    private int calories;
    private int cookingTime;

    public Food(String name, int calories, int cookingTime) {
        this.name = name;
        this.calories = calories;
        this.cookingTime = cookingTime;
    }

    public void cook() {
        System.out.println("Готовится еда");
    }

    public void displayInfo() {
        System.out.println(name + ", калории: " + calories + ", время: " + cookingTime + " мин.");
    }
}