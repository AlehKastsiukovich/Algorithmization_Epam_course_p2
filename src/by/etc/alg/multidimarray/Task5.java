package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу (n -четное).
 * (1 1 1 1)
 * (2 2 2 0)
 * (3 3 0 0)
 * (n 0 0 0)
 */

public class Task5 {
    private static int[][] matrix;
    private static int n;


    public static void createMatrix(int[][] array) {
        int count = 1;

        int temp = n;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < temp; j++) {
                array[i][j] = count;
            }
            count++;
            temp--;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        while (true) {

            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Enter array size: ");
            }

            n = scanner.nextInt();
            if (n > 0) {
                matrix = new int[n][n];
                break;
            }
        }

        createMatrix(matrix);
    }
}
