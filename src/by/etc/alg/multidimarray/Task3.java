package by.etc.alg.multidimarray;


import java.util.Random;
import java.util.Scanner;

/**
 * Дана матрица. Вывести к-тую строку и p-тый столбец.
 */

public class Task3 {
    private static int[][] matrix;
    private static int n;
    private static int m;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void generateArray() {
        System.out.println("Enter matrix size: ");

        while (true) {
            n = scanner.nextInt();
            m = scanner.nextInt();

            if ((n > 0)&&(m > 0)) {
                matrix = new int[n][m];
                break;
            } else {
                System.out.println("Your enter wrong numbers.");
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(100) - 50;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solution(int[][] array) {
        System.out.println("Enter line then column: ");

        int k = 0;
        int p = 0;

        while (true) {
            k = scanner.nextInt();
            p = scanner.nextInt();
            if ((k >= 0) && (p >=0)) {
                break;
            } else {
                System.out.println("Wrong numbers. Try again.");
            }
        }

        System.out.println("Line k: ");
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(array[k][i] + " ");
        }

        System.out.println();

        System.out.println("Column p: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j][p] + " ");
        }
    }

    public static void main(String[] args) {
        generateArray();
        solution(matrix);
    }
}
