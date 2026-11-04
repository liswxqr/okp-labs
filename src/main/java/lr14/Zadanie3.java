package lr14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) throws IOException {

        Random random = new Random();
        PrintWriter writer = new PrintWriter("f.txt");
        for (int i = 0; i < 10; i++) {
            writer.println(random.nextInt(201) - 100);
        }
        writer.close();

        Scanner scanner = new Scanner(new File("f.txt"));
        PrintWriter writerG = new PrintWriter("g.txt");
        PrintWriter writerH = new PrintWriter("h.txt");

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println(number);
            if (number % 10 == 0) {
                writerG.println(number);
            } else {
                writerH.println(number);
            }
        }

        scanner.close();
        writerG.close();
        writerH.close();

        System.out.println("Кратные 10 записаны в g.txt, остальные в h.txt");
    }
}
