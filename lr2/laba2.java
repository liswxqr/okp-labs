import java.util.Arrays;
import java.util.Scanner;

public class laba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание:");
        System.out.println("1 - Произведение элементов на нечётных позициях");
        System.out.println("2 - Сумма и число отрицательных элементов под побочной диагональю");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Введите размер массива");
                int n = scanner.nextInt();
                int[] array = new int[n];
                System.out.println("Введите элементы массива");
                for (int i = 0; i < n; i++){
                    array[i] = (int)(Math.random() * 21) - 10;
                }
                long product = 1;
                for (int i = 1; i < array.length; i += 2){
                    product *= array[i];
                }
                System.out.println("Произведение элементов на нечетных позициях");
                break;
            case 2:
                System.out.print("Введите размер матрицы N: ");
                int size = scanner.nextInt();
                int[][] matrix = new int[size][size];
                System.out.println("Введите элементы матрицы:");
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[0].length; j++) {
                        matrix[i][j] = scanner.nextInt();
                    }
                }
                int sum = 0;
                int count = 0;
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (i + j >= size - 1 && matrix[i][j] < 0) {
                            sum += matrix[i][j];
                            count++;
                        }
                    }
                }
                System.out.println("Сумма отрицательных элементов под побочной диагональю: " + sum);
                System.out.println("Количество отрицательных элементов: " + count);
                break;
            default:
                System.out.println("Нет такого задания");
        }
    }
}