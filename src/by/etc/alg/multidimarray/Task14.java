package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Сформировать случайную матрицу mxn, состоящую из нулей и единиц. Причем каждом в каждом
столбце число единиц равно номеру столбца.
 */

public class Task14 {

    public static int[][] matrix;

    public static void initMatrix(int n, int m) {
        matrix = new int[n][m];
    }

    public static void feelArray(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {

            for (int i = 0; i < j; i++) {
                array[i][j] = 1;
            }
        }
        System.out.println();
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

        feelArray(matrix);
        printArray(matrix);
    }
}
