package lr8;

public class Pizza extends Food {
    private String toppings;

    public Pizza(String name, int calories, int cookingTime, String toppings) {
        super(name, calories, cookingTime);
        this.toppings = toppings;
    }

    @Override
    public void cook() {
        System.out.println("Запекается в духовке");
    }

    public void addTopping() {
        System.out.println("Добавлена начинка: " + toppings);
    }
}