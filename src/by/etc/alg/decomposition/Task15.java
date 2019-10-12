package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Найти все н-значные натуральные числа, цифры в которых образуют
строго возрастающую последовательность.
 */

public class Task15 {
    private static int n;

    public static void readData() {
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n = scanner.nextInt();
            if (n > 1) {
                break;
            }
        }
    }

    public static void findSequence(int n) {
        for (int i = 1; i <= 10 - n; i++) {
            String word = "";

            for (int j = i; j <= i + n - 1; j++) {
                word += j;
            }

            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        readData();
        findSequence(n);
    }
}

