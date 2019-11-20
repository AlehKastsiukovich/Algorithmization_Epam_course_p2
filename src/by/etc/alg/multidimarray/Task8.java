package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
В числовой матрице поменять местами два столбца (любых столбца), т.е все элементы одного столбца
поставить на позиции другого. Номера столбцов вводит пользователь.
 */

public class Task8 {
    public static int[][] array;

    public static void createMatrix(int n, int m) {
        array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
    }

    public static void invertColumn(int[][] array, int first, int second) {
        for (int i = 0; i < array.length; i++) {
            int temp;
            temp = array[i][first];
            array[i][first] = array[i][second];
            array[i][second] = temp;
        }
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
        int n;
        int m;

        while (true) {
            System.out.println("Enter size of array n then m: ");

            while (!scanner.hasNextInt()) {
                scanner.next();
            }

            n = scanner.nextInt();
            m = scanner.nextInt();

            if (n > 0 && m > 0) {
                break;
            } else {
                System.out.println("You enter wrong numbers. Try again.");
            }
        }

        createMatrix(n, m);
        printArray(array);

        invertColumn(array, 1, 2);
        printArray(array);
    }
}
