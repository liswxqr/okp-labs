package lr12;

public class Drama extends Film {
    private int oscars;

    public Drama(String title, int id, int duration, int oscars) {
        super(title, id, duration);
        this.oscars = oscars;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Оскаров: " + oscars);
    }
}
