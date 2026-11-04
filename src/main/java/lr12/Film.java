package lr12;

public class Film {
    private String title;
    private int id;
    private int duration;

    public Film(String title, int id, int duration) {
        this.title = title;
        this.id = id;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void displayInfo() {
        System.out.println("Фильм: " + title + ", id: " + id + ", длительность: " + duration + " мин.");
    }
}
