package by.etc.alg.sort;


import java.util.Arrays;

/**
 * Сортировка выбором. Дана последовательность чисел a1<=a2<=..an. Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого этого в массиве начиная с первого элемента находим
 * максимальный элемент и ставим на первое место, а первый на место наибольшего
 */

public class Task3 {

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 9, 99, 100, 111, 222};

        for (int i = 0; i < arr.length; i++) {
            int maxElem = arr[i];
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maxElem) {
                    maxElem = arr[j];
                    maxIndex = j;
                }
            }

            if (i != maxIndex) {
                int tmp = arr[i];
                arr[i] = arr[maxIndex];
                arr[maxIndex] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
