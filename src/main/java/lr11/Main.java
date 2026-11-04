package lr11;

public class Main {
    public static void main(String[] args) {

        Actor[] actors = {
                new Actor("Иван", 40, "Драма"),
                new Singer("Петр", 30, "Мюзикл"),
                new Singer("Анна", 25, "Поп"),
                new Dancer("Алексей", 28, "Балет"),
                new Dancer("Мария", 22, "Хип-хоп")
        };

        for (Actor actor : actors) {
            System.out.println("--------------------");
            actor.displayInfo();
            actor.perform();
            actor.perform("Гамлет");
            actor.perform(5);
            System.out.println("Награды: " + actor.getAwards());
        }
    }
}
