package lr14;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) throws IOException {

        File file = new File("game.txt");

        PrintWriter writer = new PrintWriter(file);
        writer.println("Название: The Witcher 3");
        writer.println("Жанр: RPG");
        writer.println("Год: 2015");
        writer.close();

        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());

        System.out.println("--------------------");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
