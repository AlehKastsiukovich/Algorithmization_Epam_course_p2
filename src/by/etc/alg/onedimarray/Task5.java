package by.etc.alg.onedimarray;

/**
 * Вывести на печать только те числа, для которых аi > i
 */

public class Task5 {

    public static void printBiggerElem(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {0, -3, 4, 10, 12, -50, 99};
        printBiggerElem(array);
    }
}
