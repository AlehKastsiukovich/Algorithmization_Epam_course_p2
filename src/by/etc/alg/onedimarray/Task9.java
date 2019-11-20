package by.etc.alg.onedimarray;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число
 * Если таких чисел несколько, то определить наименьшее из них.
 */

public class Task9 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Enter size of array: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter size of array: ");
        }

        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000) - 500;
        }

        int[] freqArray = new int[array.length];

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            int count = 0;
            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j]) {
                    count++;
                }
            }

            freqArray[i] = count;
        }

        int max = freqArray[0];
        int iElem = 0;
        for (int i = 0; i < freqArray.length; i++) {

            if (freqArray[i] > max) {
                max = freqArray[i];
                iElem = i;
            }
        }

        int minFreq = array[iElem];
        for (int i = 0; i < freqArray.length; i++) {

            if (freqArray[i] == max) {

                if (array[i] < minFreq) {
                    minFreq = array[i];
                }
            }
        }

        System.out.println("Most frequently (low) number is " + minFreq);
    }
}
