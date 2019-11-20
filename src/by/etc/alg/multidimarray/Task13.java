package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Отсортировать столбцы матрицы по возрастанию и убыванию.
*/

public class Task13 {
    public static int[][] matrix;

    public static void initMatrix(int n, int m) {
        matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
    }

    public static void increaseSortColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            boolean isSorted = false;
            int temp;

            while (!isSorted) {

                for (int i = 0; i < array.length - 1; i++) {
                    isSorted = true;

                    if (array[i][j] > array[i + 1][j]) {
                        isSorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = temp;
                    }
                }
            }
        }
    }

    public static void decreaseSortColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            boolean isSorted = false;
            int temp;

            while (!isSorted) {

                for (int i = 0; i < array.length - 1; i++) {
                    isSorted = true;

                    if (array[i][j] < array[i + 1][j]) {
                        isSorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i + 1][j];
                        array[i + 1][j] = temp;
                    }
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

        increaseSortColumn(matrix);
        printArray(matrix);

        decreaseSortColumn(matrix);
        printArray(matrix);
    }
}
