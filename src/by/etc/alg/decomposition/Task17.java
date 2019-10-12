package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Из заданного числа вычесть сумму его цифр. Из результата вновь вычесть сумму его цифр. Сколько таких
действий нужно провести, чтобы получился нуль.
 */

public class Task17 {
    private static int n;

    public static void readData() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            n = scanner.nextInt();
            if (n > 1) {
                break;
            }
        }
    }

    public static int[] numberToArray(int number) {
        String word = Integer.toString(number);
        char[] charArray = word.toCharArray();
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }
        return intArray;
    }

    public static int sumOfNumbers(int [] array) {
        int sum = 0;

        for(int i = 0; i < array.length;i++) {
            sum += array[i];
        }

        return sum;
    }

    public static void quantityMinus(int number) {
        int quantity = 0;
        System.out.println("Number: " + number);

        while (number != 0) {
            number -= sumOfNumbers(numberToArray(number));
            quantity++;
        }

        System.out.println("Number of deductions: " + quantity);
    }

    public static void main(String[] args) {
        readData();
        quantityMinus(n);
    }
}
