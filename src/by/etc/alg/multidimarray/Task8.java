package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
В числовой матрице поменять местами два столбца (любых столбца), т.е все элементы одного столбца
поставить на позиции другого. Номера столбцов вводит пользователь.
 */

public class Task8 {
    public static int [][] matrix;

    public static void createMatrix() {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;

        System.out.println("Enter size of array: ");

        while (true) {
            System.out.println("N:");
            n = scanner.nextInt();
            System.out.println("M: ");
            m = scanner.nextInt();
            if (n > 0 && m > 0) {
                break;
            } else {
                System.out.println("You enter wrong numbers. Try again.");
            }
        }

        matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
        }

        System.out.println("Matrix before: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void invertColumn(int[][] array) {
        int firstColumn;
        int secondColumn;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first column: ");
            firstColumn = scanner.nextInt();
            System.out.println("Enter second column: ");
            secondColumn = scanner.nextInt();
            if (firstColumn < matrix.length && secondColumn < matrix.length &&
                    firstColumn != secondColumn) {
                break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            int temp;
            temp = array[i][firstColumn];
            array[i][firstColumn] = array[i][secondColumn];
            array[i][secondColumn] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        createMatrix();
        invertColumn(matrix);
    }
}
