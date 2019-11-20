package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Найти сумму n-значных чисел, содержащих только нечетные цифры. Определит так же, сколько четных цифр в найденной
 сумме. Для решения задачи использовать декомпозицию.
 */

public class Task16 {

    public static boolean checkOdd(int number) {
        String word = Integer.toString(number);
        char[] charArray = word.toCharArray();
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
            if (intArray[i] % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    public static long findSum(int n) {
        int sum = 0;

        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {

            if (checkOdd(n)) {
                sum += n;
            }
        }

        return sum;
    }

    public static int findEvenQuantity(long sum) {
        int quantity = 0;
        String word = Long.toString(sum);
        char[] charArray = word.toCharArray();
        long[] longArray = new long[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            longArray[i] = Character.getNumericValue(charArray[i]);
            if (longArray[i] % 2 == 0) {
                quantity++;
            }
        }

        return quantity;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Enter n-size of number: ");
        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Enter n-size of number: ");
            }

            n = scanner.nextInt();

            if (n > 0) {
                break;
            } else {
                System.out.println("Enter n-size of number: ");
            }
        }

        long sum = findSum(n);

        int quantity = findEvenQuantity(sum);

        System.out.println(quantity);
    }
}

