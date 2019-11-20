package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
    private static int[][] matrix;

    public static void createMatrix(int n) {
        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
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

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {

            System.out.println("Enter matrix size: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Enter matrix size: ");
            }

            n = scanner.nextInt();

            if (n > 0) {
                break;
            }
        }

        createMatrix(n);
        printArray(matrix);
        findPosElements();
    }
}
