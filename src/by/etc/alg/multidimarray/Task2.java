package by.etc.alg.multidimarray;


import java.util.Random;
import java.util.Scanner;

/**
 * Дана квадратная матрица. Вывести элементы, находящиеся на диагонали.
 */

public class Task2 {
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

            if ((n > 0) && (m > 0)) {
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
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.println(array[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        generateArray();
        solution(matrix);
    }
}
