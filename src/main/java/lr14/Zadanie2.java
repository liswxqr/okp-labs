package lr14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("f.txt");

        System.out.println("Введите 10 целых чисел:");
        for (int i = 0; i < 10; i++) {
            writer.println(input.nextInt());
        }
        writer.close();

        Scanner scanner = new Scanner(new File("f.txt"));
        int sum = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(number);
            if (number < 0) {
                sum += number;
            }
        }
        scanner.close();

        System.out.println("Сумма отрицательных: " + sum);
    }
}
