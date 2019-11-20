package by.etc.alg.sort;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Сортировка Шелла.
 */

public class Task6 {
    private static int[] arr;

    public static int[] genArr(int num) {
        Random random = new Random();
        arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

       return arr;
    }

    public static int[] shellSort(int[] arr) {
        int step = arr.length/2;

        while (step > 0) {
            for (int i = 0; i < (arr.length - step); i++) {
                int j = i;
                while ((j >= 0) && (arr[j] > arr[j + step])) {
                    int temp = arr[j];
                    arr[j] = arr[j + step];
                    arr[j + step] = temp;
                    j -= step;
                }
            }

            step = step/2;
        }

        return arr;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        System.out.println("Enter number of array elements: ");
        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.next();
            }

            num = scanner.nextInt();

            if (num > 0) {
                break;
            }
        }

        genArr(num);

        int[] sortedArr = shellSort(arr);

        System.out.println("Sorted array = " + Arrays.toString(sortedArr));
    }
}
