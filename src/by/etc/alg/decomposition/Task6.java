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
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 number: ");

        checkInput(scanner);
        a = scanner.nextInt();

        checkInput(scanner);
        b = scanner.nextInt();

        checkInput(scanner);
        c = scanner.nextInt();
    }

    public static int findNod(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static boolean checkRelativePrime(int val) {
        if (val == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
    }

    public static void main(String[] args) {
        readData();
        System.out.println(checkRelativePrime(findNod(a,findNod(b,c))));
    }
}
