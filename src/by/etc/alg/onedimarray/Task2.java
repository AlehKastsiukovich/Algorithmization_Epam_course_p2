package by.etc.alg.onedimarray;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана последовательность действительных чисел а1, а2, а3.. аn. Заменить все ее члены,
 * большие данного Z, этим числом. Посчитать количество замен.
 */

public class Task2 {
    private static int [] array;
    private static int z;

    public static void exchangeElements() {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                count++;
            }
        }

        System.out.println("New Array: " + Arrays.toString(array));
        System.out.println("Amount of exchanges: " + count);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        z = scanner.nextInt();

        array = new int[]{5, -100, 2, 999, 0, 3, 44, 45, 9, -99};

       exchangeElements();
    }
}
