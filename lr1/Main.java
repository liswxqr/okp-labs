import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание:");
        System.out.println("1 - Три строки в обратном порядке");
        System.out.println("2 - Проверка числа в диапазоне от -10 до 10");
        System.out.println("3 - Квадрат из звёздочек N x N");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Введите первую строку: ");
                String s1 = scanner.nextLine();
                System.out.print("Введите вторую строку: ");
                String s2 = scanner.nextLine();
                System.out.print("Введите третью строку: ");
                String s3 = scanner.nextLine();
                System.out.println("Строки в обратном порядке:");
                System.out.println(s3);
                System.out.println(s2);
                System.out.println(s1);
                break;
            case 2:
                System.out.println("ВВедите первую строку: ");
                int n = scanner.nextInt();
                if (n >= -10 && n <= 10) {
                    System.out.println("Число принадлежит диапозону");
                } else {
                    System.out.println("Число не принадлежит диапозону");
                }
                break;
            case 3:
                System.out.println("Введи размер квадрата N:");
                int size = scanner.nextInt();
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.println("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Введите одну из предложенных стран");
                System.out.println("Россия , Беларусь , Нидерланды");
                System.out.print("Ответ:");
                String choicee = scanner.nextLine();
                switch (choicee) {
                    case "Russia":
                        System.out.println("Москва");

                        break;
                    case "Belarus":
                        System.out.println("Minsk");
                        break;

                    case "Netherlands":
                        System.out.println("Amsterdam");

                    default:
                        System.out.println("Нет такого задания");
                }
        }
    }
}
