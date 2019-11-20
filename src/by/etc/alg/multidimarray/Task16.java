package by.etc.alg.multidimarray;


import java.util.Scanner;

/**
Построить магический квадрат порядка N.
 */

public class Task16 {
    private static int[][] magicArray;
    private static int magicSum;
    private static int n;

    public static void chooseMethod(int size) {
        if (size % 2 == 0) {
            createEvenArray();
        } else {
            createOddArray();
        }
    }

    public static void createOddArray() {
        magicSum = n * ((int) Math.pow(n, 2) + 1) / 2;
        System.out.println("Magic findSum will be " + magicSum);

        magicArray = new int[n][n];

        int i = n / 2;
        int j = n - 1;

        for (int value = 1; value <= (int) Math.pow(value, 2); ) {

            if (value == 1) {
                magicArray[i][j] = value;
            } else {
                i = i - 1;
                j = j + 1;

                if ((i == -1) && (j == n)) {
                    i = 0;
                    j = n - 2;
                }

                if (i == -1) {
                    i = n - 1;
                }

                if (j == n) {
                    j = 0;
                }

                if (magicArray[i][j] != 0) {
                    i = i + 1;
                    j = j - 2;
                }

                magicArray[i][j] = value;
                System.out.println(i + "-" + j + " /" + value);

                if (value == 9) {
                    break;
                }
            }
            value++;
        }

        printArray(magicArray);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void createEvenArray() {
        magicSum = n * ((int) Math.pow(n, 2) + 1) / 2;
        System.out.println("Magic findSum will be " + magicSum);

        magicArray = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                magicArray[i][j] = (n * i) + j + 1;
            }
        }

        for (int i = 0; i < n / 4; i++) {
            for (int j = 0; j < n / 4; j++) {
                magicArray[i][j] = (n * n + 1) - magicArray[i][j];
            }
        }

        for (int i = 0; i < n / 4; i++) {
            for (int j = 3 * (n / 4); j < n; j++) {
                magicArray[i][j] = (n * n + 1) - magicArray[i][j];
            }
        }

        for (int i = 3 * n / 4; i < n; i++) {
            for (int j = 0; j < n / 4; j++) {
                magicArray[i][j] = (n * n + 1) - magicArray[i][j];
            }
        }

        for (int i = 3 * n / 4; i < n; i++) {
            for (int j = 3 * n / 4; j < n; j++) {
                magicArray[i][j] = (n * n + 1) - magicArray[i][j];
            }
        }

        for (int i = n / 4; i < 3 * n / 4; i++) {
            for (int j = n / 4; j < 3 * n / 4; j++) {
                magicArray[i][j] = (n * n + 1) - magicArray[i][j];
            }
        }

        printArray(magicArray);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter size of array: ");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Enter size of array: ");
            }

            n = scanner.nextInt();

            if (n > 0) {
                break;
            }
        }

        chooseMethod(n);
    }
}