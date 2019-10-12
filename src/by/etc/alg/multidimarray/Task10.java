package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
    private static int[][] matrix;

    public static void initMatrix() {
        int n;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            n = scanner.nextInt();
            if (n > 0) {
                break;
            }
        }

        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void findPosElements() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    if (matrix[i][j] > 0) {
                        System.out.print(matrix[i][j] + "\t");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        initMatrix();
        findPosElements();
    }
}
