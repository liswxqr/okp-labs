package lr12;

public class Comedy extends Film {
    private int funnyRating;

    public Comedy(String title, int id, int duration, int funnyRating) {
        super(title, id, duration);
        this.funnyRating = funnyRating;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Рейтинг юмора: " + funnyRating);
    }
}
