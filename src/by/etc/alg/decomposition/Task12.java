package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Даны натуральные числа К и N. Написать метод формирования массива А, элементами которого являются
числа, сумма цифр которых равна К и которые не больше N.
 */

public class Task12 {
    private static int n;
    private static int m;
    private static int [] array;
    private static int arraySize;

    public static void initFields() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter n: ");

        }
        n = scanner.nextInt();

        System.out.println("Enter m: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter m: ");

        }
        m = scanner.nextInt();

        System.out.println("Enter array size: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter array size: ");

        }
        arraySize = scanner.nextInt();
    }

    public static int generateDigit(int p, int m) {
        return (int)(Math.random() * (m - p + 1)) + p;
    }

    public static int createNumber(int m) {
        StringBuilder sb = new StringBuilder();

        int number = (m < 10) ? generateDigit(1, m) : generateDigit(1, 9);
        sb.append(number);

        while (number < m) {
            int newNumber = generateDigit(1, 9);

            if ((number + newNumber) > m) {
            } else {
                number += newNumber;
                sb.append(newNumber);
            }
        }

        int sbToInt = Integer.parseInt(sb.toString());

        if (sbToInt > n) {
            return createNumber(m);
        } else {
            return sbToInt;
        }
    }

    public static int[] fillArray(int m) {
        array = new int[arraySize];

        for(int i = 0; i < array.length; i++) {
            array[i] = createNumber(m);
        }

       return array;
    }

    public static void main(String[] args) {
        initFields();
        fillArray(m);
    }
}
