package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Найти наибольший элемент матрицы и заменить все нечетные элементы на него
 */

public class Task15 {
    private static int[][] matrix;
    private static int maxElement;

    public static void initMatrix(int n, int m) {
        matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
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

        initMatrix(n, m);
        printArray(matrix);

        findMaxElement(matrix);

        replaceElements(matrix);
        printArray(matrix);
    }
}
