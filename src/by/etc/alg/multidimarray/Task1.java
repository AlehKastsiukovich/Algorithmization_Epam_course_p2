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
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void function(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            if (!(j % 2 == 0)) {
                if (array[0][j] > array[array.length -1][j]) {
                    System.out.println("Column: ");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i][j]);
                    }
                }
            }
        }
    }

    public static void generateArray() {
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

    public static void main(String [] args) {
        generateArray();
        function(matrix);
    }
}
