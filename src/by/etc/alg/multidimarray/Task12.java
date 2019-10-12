package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task12 {
    private static int[][] matrix;

    public static void initMatrix() {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size: ");
        while (true) {
            n = scanner.nextInt();
            if (n >0) {
                break;
            }
        }

        matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
        }

        System.out.println("Array before sorting: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sortByIncrease() {
        for(int i = 0; i < matrix.length; i++) {

            boolean isSorted = false;
            int temp;

        while (!isSorted) {
            isSorted = true;
                for(int j = 0;j < matrix[i].length - 1; j++) {
                    if(matrix[i][j] > matrix[i][j+1]) {
                        isSorted = false;
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j+1];
                        matrix[i][j+1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted array by increase: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sortByDecrease() {
        for (int i = 0; i < matrix.length; i++) {
            boolean isSorted = false;
            int temp;

            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < matrix[i].length - 1; j++) {
                    if (matrix[i][j] < matrix[i][j + 1]) {
                        isSorted = false;
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted array by decrease: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initMatrix();
        sortByDecrease();
    }
}
