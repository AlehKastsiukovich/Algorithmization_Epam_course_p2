package by.etc.alg.onedimarray;

import java.util.Scanner;

/**
 * В массив A[N] занесены натуральные числа. Найти сумму тех чисел, которые кратны данному К.
 */

public class Task1 {
    private static int k;
    private static int[] array;

    public static int function() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter K: ");
        k =  scanner.nextInt();

        array = new int[]{1, 10, 15, 22, -10, 99, 6, 400};

        System.out.println(function());
    }
}
