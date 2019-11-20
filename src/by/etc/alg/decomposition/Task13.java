package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Найти и напечатать все пары близнецов на отрезке [n,2n]. n>2.
 */

public class Task13 {
    private static int n;

    public static void findTwins(int n) {
        for (int i = n; i <= 2 * n - 2; i++) {
            System.out.println(i + " " + (i + 2));
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter n: ");
        }

        while (true) {
            n = scanner.nextInt();
            if (n >= 2) {
                break;
            }
        }

        findTwins(n);
    }
}
