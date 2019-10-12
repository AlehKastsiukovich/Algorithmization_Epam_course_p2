package by.etc.alg.sort;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Сортировка Шелла.
 */

public class Task6 {
    private static int[] arr;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void genArr() {
        System.out.println("Enter number of array elements: ");
        int num = scanner.nextInt();
        arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort() {
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

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        genArr();
        shellSort();
    }
}
