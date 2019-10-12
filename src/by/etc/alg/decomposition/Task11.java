package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Написать метод определяющий в каком из двух чисел больше цифр.
 */

public class Task11 {
    private static int a;
    private static int b;

    public static void readData() {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("A: ");
        a = scanner.nextInt();
        System.out.println("B: ");
        b = scanner.nextInt();
    }

    public static void findMoreDignits(int a, int b) {
        char [] firstArrDigits = String.valueOf(a).toCharArray();
        char [] secondArrDigits = String.valueOf(b).toCharArray();

        if(firstArrDigits.length > secondArrDigits.length) {
            System.out.println("Number A contain more digits.");
        } else if(secondArrDigits.length > firstArrDigits.length) {
            System.out.println("Number B contain more digits.");
        } else {
            System.out.println("Numbers are contain same number of digits.");
        }
    }

    public static void main(String[] args) {
        readData();
        findMoreDignits(a,b);
    }
}
