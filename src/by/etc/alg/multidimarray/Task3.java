package by.etc.alg.multidimarray;


import java.util.Random;
import java.util.Scanner;

/**
 * Дана матрица. Вывести к-тую строку и p-тый столбец.
 */

public class Task3 {
    private static int[][] array;
    private static int n;
    private static int m;


    public static void generateArray(int n, int m) {
        Random random = new Random();
        array = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                array[i][j] = random.nextInt(100) - 50;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printLine(int[][] array, int line) {
        System.out.println("Line k: ");
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(array[line][i] + " ");
        }
    }

    public static void printColumn(int[][] array, int column) {
        System.out.println("Column p: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j][column] + " ");
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
        System.out.println("Enter M: ");
        m = initArrSize(scanner);

        generateArray(n, m);

        printColumn(array, 2);
        printLine(array, 1);
    }
}
