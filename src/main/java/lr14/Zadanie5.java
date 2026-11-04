package lr14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) throws IOException {

        PrintWriter writer = new PrintWriter("f.txt");
        int[] numbers = {5, -12, 0, -3, 20, -45, 7, -10, -11, 100};
        for (int number : numbers) {
            writer.println(number);
        }
        writer.close();

        Scanner scanner = new Scanner(new File("f.txt"));
        int count = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(number);
            if (number < -10) {
                count++;
            }
        }
        scanner.close();

        System.out.println("Количество чисел, меньших -10: " + count);
    }
}
