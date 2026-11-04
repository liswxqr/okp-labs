package lr7;

public class Main {
    String name;
    String sport;
    int medals;

    static int totalAthletes = 0;
    static int totalMedals = 0;

    public Main(String name, String sport, int medals) {
        this.name = name;
        this.sport = sport;
        this.medals = medals;
        totalAthletes++;
        totalMedals += medals;
    }
    public static void displayInfo() {

        System.out.println("всего спортсменов: " + totalAthletes);
        System.out.println("всего медалей: " + totalMedals);
    }


    public static double getAverageMedals() {
        return (double) totalMedals / totalAthletes;
    }

    public static void main(String[] args) {
        new Main("Иван", "Бокс", 3);
        new Main("Петр", "Плавание", 5);
        new Main("Алексей", "Бег", 2);
        new Main("Максим", "Теннис", 4);
        new Main("Дмитрий", "Борьба", 6);

        System.out.println("Всего спортсменов: " + totalAthletes);
        System.out.println("Всего медалей: " + totalMedals);
        System.out.println("Среднее количество медалей: " + getAverageMedals());
    }
}