package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Написать метод, проверяющий являются ли три числа взаимно простыми.
 */

public class Task6 {
    private static int a;
    private static int b;
    private static int c;

    public static void readData() {
        System.out.println("Enter 3 number: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    public static int findNod(int a, int b) {
        while(b != 0) {
            int temp = a%b;
            // System.out.println(temp);
            a = b;
            b = temp;
        }
        return a;

    }

    public static void checkRelativePrime(int a) {
        if (a == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        readData();
        checkRelativePrime(findNod(a,findNod(b,c)));
    }
}
