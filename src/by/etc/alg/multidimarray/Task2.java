package by.etc.alg.multidimarray;


import java.util.Random;
import java.util.Scanner;

/**
 * Дана квадратная матрица. Вывести элементы, находящиеся на диагонали.
 */

public class Task2 {
    private static int[][] matrix;
    private static int n;


    public static void generateArray(int n) {
        Random random = new Random();
        matrix = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100) - 50;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printDiagonal(int[][] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (i == j) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }

    public static int initArrSize(Scanner scanner) {
        int num;

        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.next();
            }

            num = scanner.nextInt();

            if (num > 0) {
                break;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");
        n = initArrSize(scanner);

        generateArray(n);
        printDiagonal(matrix);
    }
}
