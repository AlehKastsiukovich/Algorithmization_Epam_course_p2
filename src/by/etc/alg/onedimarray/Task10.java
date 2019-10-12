package by.etc.alg.onedimarray;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Дан целочисленный массив с количеством n. Сжать массив, выбросив из него каждый второй элемент(Освободившиеся
 * элементы заполнить нулями). Примечание. Дополнительный массив не использовать
 */

public class Task10 {

    public static void createArray(int[] array) {
        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter size of array: ");
        int n = 0;
        while (true) {
            n = scanner.nextInt();
            if (n > 0) {
                break;
            }
        }

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) - 25;
        }

        createArray(array);
    }
}
