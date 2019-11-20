package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Написать метод определяющий в каком из двух чисел больше цифр.
 */

public class Task11 {
    private static int a;
    private static int b;

    public static void initVar() {
        System.out.println("Enter two numbers: ");

        a = readEnter();
        b = readEnter();
    }

    public static int readEnter() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int number;

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        number = scanner.nextInt();

        return number;
    }


    public static void findMoreDignits(int a, int b) {
        char[] firstArrDigits = String.valueOf(a).toCharArray();
        char[] secondArrDigits = String.valueOf(b).toCharArray();

        if (firstArrDigits.length > secondArrDigits.length) {
            System.out.println("Number A contains more digits.");
        } else if (secondArrDigits.length > firstArrDigits.length) {
            System.out.println("Number B contains more digits.");
        } else {
            System.out.println("Numbers are contain same number of digits.");
        }
    }

    public static void main(String[] args) {
        initVar();
        findMoreDignits(a,b);
    }
}
