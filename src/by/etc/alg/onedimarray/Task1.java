package by.etc.alg.onedimarray;


import java.util.Scanner;

/**
 * В массив A[N] занесены натуральные числа. Найти сумму тех чисел, которые кратны данному К.
 */

public class Task1 {
    private static int k;
    private static int[] array;

    public static int findSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter K: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter K: ");
        }

        k =  scanner.nextInt();

        array = new int[]{1, 10, 15, 22, -10, 99, 6, 400};

        int sum = findSum(array);

        System.out.println(sum);

    }
}
