package by.etc.alg.onedimarray;


import java.util.Arrays;

/**
 * Дана последовательность целых чисел. Образовать новую последовательность выбросив те члены
 * которые равны min(a1,a2..an)
 */

public class Task8 {

    public static int[] createNewList(int[] array) {
        int count = 0;
        int min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] == min) {
                count++;
            }
        }

        int[] newList = new int[array.length - count];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != min) {
                newList[j] = array[i];
                j++;
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        int[] array = {22, 10, 15, -2, -1, 99, -1};
        int[] newArr = createNewList(array);

        System.out.println(Arrays.toString(newArr));

    }
}
