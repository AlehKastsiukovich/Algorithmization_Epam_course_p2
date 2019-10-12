package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Отсортировать столбцы матрицы по возрастанию и убыванию.
*/

public class Task13 {
    public static int [][] matrix;

    public static void initMatrix() {
        int n;
        int m;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
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

    public static void increaseSortColumn(int [][] array) {
        for(int j = 0; j < array[0].length; j++) {
            boolean isSorted = false;
            int temp;

            while (!isSorted) {
            for (int i = 0; i < array.length-1; i++) {
                    isSorted = true;
                    if(array[i][j] > array[i+1][j]) {
                        isSorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i+1][j];
                        array[i+1][j] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted columns by increase: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void decreasSortColumn(int [][] array) {
        for(int j = 0; j < array[0].length; j++) {
            boolean isSorted = false;
            int temp;
            while (!isSorted) {
                for (int i = 0; i < array.length-1; i++) {

                    isSorted = true;
                    if(array[i][j] < array[i+1][j]) {
                        isSorted = false;
                        temp = array[i][j];
                        array[i][j] = array[i+1][j];
                        array[i+1][j] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted columns by decrease: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initMatrix();
        increaseSortColumn(matrix);
        decreasSortColumn(matrix);
    }
}
