package lr14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        PrintWriter writer = new PrintWriter("time.txt");

        System.out.println("Введите 15 значений времени в секундах:");
        for (int i = 0; i < 15; i++) {
            writer.println(Double.parseDouble(input.nextLine()));
        }
        writer.close();

        Scanner scanner = new Scanner(new File("time.txt"));
        double sum = 0;
        int count = 0;
        while (scanner.hasNextLine()) {
            sum += Double.parseDouble(scanner.nextLine());
            count++;
        }
        scanner.close();

        System.out.println("Среднее время: " + sum / count);
    }
}
