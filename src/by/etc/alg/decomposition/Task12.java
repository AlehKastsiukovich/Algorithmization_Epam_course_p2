package by.etc.alg.decomposition;


import java.util.Arrays;
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

    public static void readData() {
        System.out.println("Enter n and m: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        arraySize = scanner.nextInt();
    }

    public static int genRanDignit(int p, int m) {
        return (int)(Math.random() * (m - p + 1)) + p;
    }

    public static int createNumber(int m) {
        StringBuilder sb = new StringBuilder();

        int number = (m < 10) ? genRanDignit(1, m) : genRanDignit(1,9);
        sb.append(number);

        while (number < m) {
            int newNumber = genRanDignit(1,9);

            if((number + newNumber) > m) {
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

    public static void fillArray(int m) {
        array = new int[arraySize];
        for(int i = 0; i < array.length; i++) {
            array[i] = createNumber(m);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        readData();
        fillArray(m);
    }
}
