package by.etc.alg.onedimarray;


/**
 * Найти мах(a1 + a2n, a2 + a2n-1, an + an+1)
 */

public class Task7 {

    public static int[] arrayOfSums(int[] array) {
        int[] newArray = new int[array.length / 2];
        int i = 0;

        for (int j = 0; j < newArray.length; j++) {

            newArray[j] = array[i] + array[i + 1];
            i = i + 2;

        }
        return newArray;
    }

    public static int maxOfNewArray(int[] newArray) {
        int max = newArray[0];

        for (int i = 1; i < newArray.length; i++) {

            if (newArray[i] > max) {
                max = newArray[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {3, 15, -10, 15, 2, 33};
        System.out.println(maxOfNewArray(arrayOfSums(array)));
    }
}
