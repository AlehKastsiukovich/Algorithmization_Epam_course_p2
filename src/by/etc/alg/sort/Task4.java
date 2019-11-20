package by.etc.alg.sort;


import java.util.Arrays;

/**
 * Сортировка обменами. Дана последовательность чисел a1<=a2<=..an. Требуется переставить числа в порядке
 * возрастания. Для этого сравниваются два соседних числа аi и аi+1. Если аi > аi+1, то делается перестановка
 * Так продолжается пока не станут расположены в порядке возрастания. Составить алгоритм сортировки,
 * подсчитывая при этом количество перестановок.
 */

public class Task4 {

    public static void main(String[] args) {
        int[] array = {1,3,6,12,24,99,1000};

        boolean isSorted = false;
        int count = 0;
        int tmp;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    count++;
                }
            }
        }

        System.out.println("count = " + count + "/ array: " + Arrays.toString(array));
    }
}
