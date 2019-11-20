package by.etc.alg.decomposition;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Дано натуральное число n. Написать метод для формирования массива элементами которого являются цифры числа n.
 */

public class Task10 {
    private static int n;
    private static int[] array;

    public static int[] createArray(int n) {
        String stringNum = Integer.toString(n);

        char[] charArray = stringNum.toCharArray();

        array = new int[charArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Character.getNumericValue(charArray[i]);
        }

        return array;
    }

    public static int readN() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int val;

        System.out.println("Enter n: ");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter n: ");
        }

        while ((val = scanner.nextInt()) < 0) {
            System.out.println("Enter positive number!");
        }

        return val;
    }

    public static void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        n = readN();
        int[] array = createArray(n);

        System.out.println(Arrays.toString(array));
    }
}
