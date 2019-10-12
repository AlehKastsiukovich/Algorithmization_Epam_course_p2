package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Найти наибольший элемент матрицы и заменить все нечетные элементы на него
 */

public class Task15 {
    private static int [][] matrix;
    private static int maxElement;

    public static void initMatrix() {
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");

        while (true) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            if (n > 0 && m > 0) {
                break;
            }
        }

        matrix = new int[n][m];

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

    public static void findMaxElement(int[][] array) {
        maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        System.out.println("Max element: " + maxElement);
    }

    public static void replaceElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = maxElement;
                }
            }
        }

        System.out.println("Formed matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initMatrix();
        findMaxElement(matrix);
        replaceElements(matrix);
    }
}
