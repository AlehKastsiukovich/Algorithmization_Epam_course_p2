package by.etc.alg.sort;


import java.util.Random;
import java.util.Scanner;

/**
 * Даны дроби p1/q1, p2/q2, .. pn/qn. (pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочевает их в порядке возрастания.
 */

public class Task8 {
    private static int[] pArray;
    private static int[] qArray;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void genArray() {
        System.out.println("Enter number of elements: ");
        int elemNumber = scanner.nextInt();
        pArray = new int[elemNumber];
        qArray = new int[elemNumber];

        for (int i = 0; i < pArray.length; i++) {
            pArray[i] = random.nextInt(10) + 1;
            qArray[i] = random.nextInt(10) + 1;
        }

        printArray();
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

    public static boolean isNoz(int[] arr, int noz) {
        for (int i = 0; i < arr.length; i++) {
            if (noz % arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int findNoz() {
        int [] arr = shellSort(qArray);
        int noz = arr[arr.length - 1];
        int n = 2;

        while (!(isNoz(arr, noz))) {
            noz *= n;
            n++;
        }

        return noz;
    }

    public static void initNumerators() {
        int n = findNoz();
        System.out.println("New denominator is: " + n);

        for (int i = 0; i < pArray.length; i++) {
            int multiplier = n / qArray[i];
            pArray[i] *= multiplier;
            qArray[i] = n;
            System.out.print(pArray[i] + "/" + n + " | ");
        }
        System.out.println();
    }

    public static void printArray() {
        for (int i = 0; i < pArray.length; i++) {
            System.out.print(pArray[i] + "/" + qArray[i] + " | ");
        }
    }

    public static void main(String[] args) {
        genArray();
        initNumerators();
        pArray = shellSort(pArray);
        System.out.println("Sorted: ");
        printArray();
    }
}
