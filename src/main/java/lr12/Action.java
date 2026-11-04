package lr12;

public class Action extends Film {
    private int explosions;

    public Action(String title, int id, int duration, int explosions) {
        super(title, id, duration);
        this.explosions = explosions;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Взрывов: " + explosions);
    }
}
