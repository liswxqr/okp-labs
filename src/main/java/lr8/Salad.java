package lr8;

public class Salad extends Food {
    private String dressing;

    public Salad(String name, int calories, int cookingTime, String dressing) {
        super(name, calories, cookingTime);
        this.dressing = dressing;
    }

    @Override
    public void cook() {
        System.out.println("Нарезается и смешивается");
    }

    public void addDressing() {
        System.out.println("Добавлена заправка: " + dressing);
    }
}