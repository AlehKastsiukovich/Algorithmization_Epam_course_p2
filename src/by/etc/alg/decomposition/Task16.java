package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Найти сумму n-значных чисел, содержащих только нечетные цифры. Определит так же, сколько четных цифр в найденной
сумме. Для решения задачи использовать декомпозицию.
 */

public class Task16 {
    private static int number;
    private static int n;

    public static void readData() {
        System.out.println("Enter number and N: ");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            n = scanner.nextInt();
            number = scanner.nextInt();
            String word = Integer.toString(number);
            char[] charArray = word.toCharArray();
            if (n > 0 && charArray.length == n) {
                break;
            }
        }
    }

    public static boolean checkOdd(int number) {
        String word = Integer.toString(number);
        char [] charArray = word.toCharArray();
        int [] intArray = new int[charArray.length];

        for(int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
            if(intArray[i]%2!=0) {
                return false;
            }
        }
        return true;
    }

    public static long sum(int number) {
        int sum = 0;
        if(checkOdd(number)) {
            sum += number;
        }
        return sum;
    }

    public static void evenQuantity(long sum) {
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
        System.out.println("Number of even digits - " + quantity);
    }

    public static void main(String[] args) {
        readData();
        System.out.println(checkOdd(number));
        evenQuantity(1244445533666688888l);
    }
}
