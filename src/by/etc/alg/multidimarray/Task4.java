package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
 * Сформировать матрицу порядка n по заданному образцу (n четное).
 * (1 2 3 n)
 * (n n-1 n-2 1)
 * (1 2 3 n)
 * (n n-1 n-2 1)
 */

public class Task4 {
    private static int[][] matrix;
    private static int n;
    private static Scanner scanner = new Scanner(System.in);

    public static void solution(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = j + 1;
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();

            } else {
                for (int j = n - 1; j >= 0; j--) {
                    array[i][j] = j + 1;
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            n = scanner.nextInt();
            if (n > 0) {
                matrix = new int[n][n];
                break;
            }
        }

        solution(matrix);
    }
}
