package lr11;

public class Dancer extends Actor {

    public Dancer(String name, int age, String genre) {
        super(name, age, genre);
    }

    @Override
    public String getAwards() {
        return "3 награды";
    }
}
