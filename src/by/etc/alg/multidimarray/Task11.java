package by.etc.alg.multidimarray;

/**
Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк в которых 5
встречается три и более раз.
 */

public class Task11 {
    private static int[][] matrix;

    public static void initMatrix() {
        matrix = new int[10][20];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
    }

    public static void findFive() {
        for (int i = 0; i < matrix.length; i++) {

            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == 5) {
                    count++;
                }
            }

            if (count >= 3) {
                System.out.println("Number of line which contain '5' 3 or more times: " + i);
            }
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
        initMatrix();
        printArray(matrix);
        findFive();
    }
}
