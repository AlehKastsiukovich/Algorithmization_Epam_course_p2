package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Найти все n-значные натуральные числа, цифры в которых образуют
строго возрастающую последовательность.
 */

public class Task15 {
    private static int n;

    public static void findSequence(int n) {
        for (int i = 1; i <= 10 - n; i++) {
            String seq = "";

            for (int j = i; j <= i + n - 1; j++) {
                seq += j;
            }

            System.out.println(seq);
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        while ((!scanner.hasNextInt())) {
            scanner.next();
            System.out.println("Enter n: ");
        }

        while ((n = scanner.nextInt()) <= 1) {
            System.out.println("Enter n > 1");
        }

        findSequence(n);
    }
}

