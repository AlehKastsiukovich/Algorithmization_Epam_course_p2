package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Сформировать случайную матрицу mxn, состоящую из нулей и единиц. Причем каждом в каждом
столбце число единиц равно номеру столбца.
 */

public class Task14 {

    public static int [][] matrix;

    public static void initMatrix() {
        int n;
        int m;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of matrix: ");
        while (true) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            if (n > 0 && m > 0) {
                break;
            }
        }

        matrix = new int[n][m];
    }

    public static void feelArray(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < j; i++) {
                array[i][j] = 1;
            }
        }
        System.out.println();

        System.out.println("Formed matrix: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        initMatrix();
        feelArray(matrix);
    }
}
