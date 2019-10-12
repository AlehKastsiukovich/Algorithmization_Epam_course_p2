package by.etc.alg.sort;


import java.util.Arrays;

/**
 * Пусть даны две неубывающие последовательности действительных чисел a1<=a2..an, b1<=b2..bn. Требуется указать
 * те места места, на которые нужно вставлять элементы второй последовательности в первую, так чтобы новая
 * последовательность оставалась возрастающей.
 */

public class Task7 {
    private static double[] arr1;
    private static double[] arr2;
    private static double[] newArr;

    public static void insert(double[] array) {
        for (int i = arr1.length; i < array.length; i++) {
            double elemToInsert = array[i];
            int insPlace = binarySearch(array, 0, i , elemToInsert);

            System.out.println("Element " +elemToInsert + " to array[" + insPlace + "]" );

            int j = i - 1;
            while (j >= insPlace) {
                array[j + 1] = array[j];
                j--;
            }
            array[insPlace] = elemToInsert;
        }
    }

    public static int binarySearch(double[] array, int low, int high, double value) {
        if (low == high) {
            return low;
        }

        int mid = low + ((high - low) / 2);

        if (value > array[mid]) {
            return binarySearch(array, mid + 1, high, value);
        } else if (value < array[mid]) {
            return binarySearch(array, low, mid, value);
        }

        return mid;
    }


    public static void main(String[] args) {
        arr1 = new double[]{1.0, 3.0, 5.0, 7.0};
        arr2 = new double[]{2.0, 4.0, 6.0, 8.0};
        newArr = new double[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = arr1.length; i < newArr.length; i++) {
            newArr[i] = arr2[i - arr1.length];
        }

        System.out.println(Arrays.toString(newArr));

        insert(newArr);

        System.out.println(Arrays.toString(newArr));
    }
}
