package by.etc.alg.sort;


/**
 * Даны две последовательности a1<=a2..an. b1<=b2..bm. Образовать из них новую последовательность так,
 * чтобы она тоже была не убывающей. Дополнительный массив не использовать.
 */

public class Task2 {
    private static int[] arr1;
    private static int[] arr2;
    private static int[] newArr;

    public static int[] combineArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr1.length) {
                arr[i] = arr1[i];
            } else {
                arr[i] = arr2[i - arr1.length];
            }
        }
        return arr;
    }

    public static int[] sort(int[] newArr) {
        boolean isSorted = false;
        int tmp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < newArr.length - 1; i++) {
                if (newArr[i] > newArr[i + 1]) {
                    isSorted = false;
                    tmp = newArr[i];
                    newArr[i] = newArr[i + 1];
                    newArr[i + 1] = tmp;
                }
            }
        }

        return newArr;
    }

    public static void main(String[] args) {
        arr1 = new int[]{1, 3, 5, 7, 9, 11};
        arr2 = new int[]{2, 4, 6, 8, 10, 12, 14};

        int[] arr = new int[arr1.length + arr2.length];

        newArr = combineArrays(arr);

        sort(newArr);
    }
}
