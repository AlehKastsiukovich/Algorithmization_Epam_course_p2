package by.etc.alg.decomposition;


import java.util.Arrays;
import java.util.Scanner;

/**
Составить программу,которая в массиве А[N] находит второе по величине число и вывести его на экран.
 */

public class Task5 {

    public static int [] initArray() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter number of elements of array: ");
        n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }

        System.out.println("Created array: "+Arrays.toString(array));
        return array;
    }

    public static int [] bubleSort(int [] array) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0;i < array.length -1; i++) {
                if(array[i] > array[i+1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        System.out.println("Sorted array: "+Arrays.toString(array));
        return array;
    }

    public static void findSecondMax(int [] array) {
        int secondMax = array[array.length-2];
        System.out.println("Second maximum element: "+secondMax);
    }

    public static void main(String[] args) {
        findSecondMax(bubleSort(initArray()));
    }
}
