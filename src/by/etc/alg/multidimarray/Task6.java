package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу (n -четное).
 * (1 1 1 1 1 1)
 * (0 1 1 1 1 0)
 * (0 0 1 1 0 0)
 * (* * * * * *)
 * (0 1 1 1 1 0)
 * (1 1 1 1 1 1)
 */

public class Task6 {
    private static int[][] matrix;
    private static int n;
    private static Scanner scanner = new Scanner(System.in);

    public static void solution() {
        int p = 0;
        int k = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = p; j < k; j++) {
                matrix[i][j] = 1;
            }
            p++;
            k--;
        }

        p--;
        k++;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = p; j < k; j++) {
                matrix[i][j] = 1;
            }
            p--;
            k++;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter matrix size: ");

        while (true) {
            n = scanner.nextInt();
            if (n > 0) {
                matrix = new int[n][n];
                break;
            }
        }

        solution();
    }
}
