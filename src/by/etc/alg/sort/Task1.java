package by.etc.alg.sort;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Заданно два одномерных массива с различным количесвтом элементов и натуральное число к. Объединить
 * их в один массив, включив второй массив между к-м и к+1 элементами первого, при этом не используя
 * дополнительный массив
 */

public class Task1 {
    private static int[] arr1;
    private static int[] arr2;
    private static int[] newArr;
    public static int k;

    public static int[] initArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }

    public static int initK() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter k. K must be > 0 and < array 1 length:");
        int k;
        while (true) {
            k = scanner.nextInt();
            if ((k > 0) && (k < arr1.length)) {
                break;
            } else {
                System.out.println("You enter wrong data. Try again.");
            }
        }
        return k;
    }

    public static void solution(int size) {
        arr1 = initArray(size);
        arr2 = initArray(size);
        newArr = new int[arr1.length + arr2.length];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        k = initK();

        for (int i = k + 1; i < arr2.length + k + 1; i++) {
            newArr[i] = arr2[i - (k + 1)];
        }

        for (int j = 0; j < newArr.length; j++) {
            if (j <= k) {
                newArr[j] = arr1[j];
            } else if (j > k + arr2.length) {
                newArr[j] = arr1[j - arr2.length];
            }
        }

        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int arrSize;

        while (true) {

            while (!scanner.hasNextInt()) {
                scanner.next();
            }

            arrSize = scanner.nextInt();
            if (arrSize > 0) {
                break;
            }
        }


       solution(arrSize);
    }
}
