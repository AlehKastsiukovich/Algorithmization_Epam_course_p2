package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Найти все числа армстронга на отрезке от 1 до к.
 */

public class Task14 {
    private static int k;


    public static int [] createArray(int n) {
        String temp = Integer.toString(n);

        char [] charArray = temp.toCharArray();
        int [] intArray = new int[charArray.length];

        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }

        return intArray;
    }

    public static boolean isArmstrong(int n) {
        int[] checkAr = createArray(n);
        int sum = 0;

        for (int i = 0; i < checkAr.length; i++) {
            sum += Math.pow(checkAr[i], 3);
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter interval: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter interval: ");
        }

        while ((k = scanner.nextInt()) <= 1) {
            System.out.println("Enter k > 1!");
        }

        for (int i = 1; i < k; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
}
