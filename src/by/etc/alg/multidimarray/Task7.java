package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Сформировать квадратную матрицу порядка N по правилу: A[I,J]=(I^2-J^2)/N.
Подсчитать количество положительных элементов в ней.
 */

public class Task7 {
    public static int n;
    public static double [][] matrix;

    public static void createMatrix() {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i * i - j * j) / n;
            }
        }
    }

    public static int numOfPos() {
        int count = 0;

        for(int i = 0; i < matrix.length; i++) {

            for(int j = 0; j < matrix[i].length;j++) {

                if(matrix[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter array size: ");

            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Enter array size: ");
            }

            n = scanner.nextInt();

            if (n > 0) {
                matrix = new double[n][n];
                break;
            }
        }

        createMatrix();

        System.out.println("Number of positive elements is " + numOfPos());
    }
}
