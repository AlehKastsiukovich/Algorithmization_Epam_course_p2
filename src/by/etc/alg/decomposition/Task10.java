package by.etc.alg.decomposition;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Дано натуральное число N. Написать метод для формирования массива элементами которого являются цифры числа N.
 */

public class Task10 {
    private static int N;
    private static int[] array;
    private static Scanner scanner = new Scanner(System.in);

    public static void createArray() {
        System.out.println("Enter N: ");
        while (true) {
            N = scanner.nextInt();
            if (N > 0) {
                break;
            } else {
                System.out.println("You enter wrong number, try again.");
            }
        }

        String stringNum = Integer.toString(N);

        char[] charArray = stringNum.toCharArray();

        array = new int[charArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(charArray[i]);
        }
    }

    public static void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        createArray();
        printArray();
    }
}
