package lr11;

public class Singer extends Actor {

    public Singer(String name, int age, String genre) {
        super(name, age, genre);
    }

    @Override
    public String getAwards() {
        return "5 наград";
    }
}
