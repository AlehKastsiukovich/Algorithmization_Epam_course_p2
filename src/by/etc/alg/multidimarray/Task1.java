package by.etc.alg.multidimarray;


import java.util.Random;
import java.util.Scanner;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше
 * последнего.
 */

public class Task1 {
    private static int[][] matrix;
    private static int n;
    private static int m;


    public static void printOddColumns(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            if (!(j % 2 == 0)) {
                if (array[0][j] > array[array.length - 1][j]) {
                    System.out.println("Column: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i][j]);
                    }
                }
            }
        }
    }

    public static void generateArray(int n, int m) {
        Random random = new Random();

        matrix = new int[n][m];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(100) - 50;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
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

        System.out.println("Enter n: ");
        n = initArrSize(scanner);
        System.out.println("Enter m: ");
        m = initArrSize(scanner);

        generateArray(n, m);
        printOddColumns(matrix);
    }
}
