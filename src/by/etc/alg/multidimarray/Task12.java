package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task12 {
    private static int[][] matrix;

    public static void initMatrix(int n, int m) {
        matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
    }

    public static int[][] sortByIncrease(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            int temp;

            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < array[i].length - 1; j++) {

                    if (array[i][j] > array[i][j + 1]) {
                        isSorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
            }
        }
        return array;
    }

    public static int[][] sortByDecrease(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            int temp;

            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] < array[i][j + 1]) {
                        isSorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
            }
        }
        return array;
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

        int[][] decSorted = sortByDecrease(matrix);
        System.out.println("Sorted by decrease array: ");
        printArray(decSorted);

        int[][] incSorted = sortByIncrease(matrix);
        System.out.println("Sorted by increase array: ");
        printArray(incSorted);
    }
}
