package by.etc.alg.decomposition;


import java.util.Arrays;
import java.util.Scanner;

/**
Составить программу,которая в массиве А[N] находит второе по величине число и вывести его на экран.
 */

public class Task5 {
    private static int n;

    public static int [] initArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }

        return array;
    }

    public static int [] bubbleSort(int [] array) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }

    public static int findSecondMax(int [] array) {
        return  array[array.length-2];
    }

    public static int inputData() {
        @SuppressWarnings("resouce")
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Enter n: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter n: ");
        }

        while ((n = scanner.nextInt()) < 0) {
            System.out.println("Enter a positive number: ");
        }

        return n;
    }

    public static void main(String[] args) {
        n = inputData();
        int [] array = initArray(n);

        System.out.println(Arrays.toString(array));

        int [] sortedArray = bubbleSort(array);
        System.out.println("second max value is " + findSecondMax(sortedArray));
    }
}
