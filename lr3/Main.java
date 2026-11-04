import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static class Employee {
        String fullname;
        double salary;



        Employee(String fullname, double salary) {
            this.fullname = fullname;
            this.salary = salary;

        }

        public String getFullname() {
            return fullname;
        }
        public void setFullname(String fullname){
            if (fullname != null && !fullname.trim().isEmpty()){
                this.fullname = fullname;
            }
        }
    }

    static class Report {
        static void generateReport(Employee[] employees) {
            System.out.printf("%-15s %10s%n", "Фамилия", "Зарплата");

            for (Employee employee : employees) {
                System.out.printf("%-15s %10.2f%n",
                        employee.fullname, employee.salary);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Задание 1, вариант 12");
        System.out.println("2 - Задание 2, вариант 12");
        System.out.println("3 - Задание 3");
        System.out.println("4 - Задание 4, вариант 12");
        System.out.print("Выберите задание: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Введите строку: ");
                String str1 = scanner.nextLine();

                System.out.println(str1.startsWith("Привет"));
                break;

            case 2:
                System.out.print("Введите номер телефона: ");
                String phone = scanner.nextLine();

                System.out.println(phone.matches("^\\+?375(17|25|29|33|44)\\d{7}$"));
                break;

            case 3:
                Employee[] employees = {
                        new Employee("Иванов", 1500.50),
                        new Employee("Петров", 2300.75),
                        new Employee("Сидоров", 1800.00),
                        new Employee("Смирнов", 2750.40)
                };

                Report.generateReport(employees);
                break;

            case 4:
                String text = "aba abba abbba abbbba";

                Pattern pattern = Pattern.compile("ab{3}a");
                Matcher matcher = pattern.matcher(text);

                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                break;

            default:
                System.out.println("Неверный номер задания");
        }

        scanner.close();
    }
}