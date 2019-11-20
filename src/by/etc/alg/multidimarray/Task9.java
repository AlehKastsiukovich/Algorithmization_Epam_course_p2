package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить какой столбец
содержит максимальную сумму.
 */

public class Task9 {
    private static int [][] matrix;
    private static int [] matrixOfSum;

    public static void createMatrix(int n, int m) {
        matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static int maxSumColumn(int[][] array) {
        matrixOfSum = new int[array[0].length];

        for (int j = 0; j < array[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i][j];
            }

            matrixOfSum[j] = sum;
            System.out.println(sum);
        }

        int maxSum = matrixOfSum[0];
        int indexOfMaxSum = 0;

        for (int k = 0; k < matrixOfSum.length; k++) {

            if (matrixOfSum[k] > maxSum) {
                maxSum = matrixOfSum[k];
                indexOfMaxSum = k;
            }
        }
        return indexOfMaxSum;
    }

    public static int initSize(Scanner scanner) {
        int number;

        while (true) {

            while (!scanner.hasNextInt()) {
                scanner.next();
            }

            number = scanner.nextInt();

            if (number > 0) {
                break;
            }
        }

        return number;
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

        System.out.println("Enter n: ");
        int n = initSize(scanner);
        System.out.println("Enter m: ");
        int m = initSize(scanner);

        createMatrix(n, m);
        printArray(matrix);

        System.out.println("Index of max findSum column - " + maxSumColumn(matrix));
    }
}
