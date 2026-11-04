
package lr9;

public class Main {
    public static void main(String[] args) {

        Professional[] professionals = {
                new Doctor("Иван", 10, 9.5, "Хирург"),
                new Doctor("Петр", 5, 8.7, "Терапевт"),
                new Doctor("Анна", 7, 9.0, "Кардиолог"),

                new Engineer("Алексей", 8, 9.2, "Строительство"),
                new Engineer("Дмитрий", 4, 8.5, "Программирование")
        };

        for (Professional p : professionals) {
            System.out.println("--------------------");
            p.displayInfo();
            p.work();
            System.out.println("Обязанности: " + p.getResponsibilities());
        }
    }
}
