package by.etc.alg.onedimarray;


import java.util.Random;
import java.util.Scanner;

/**
 * Дан целочисленный массив с количеством n. Сжать массив, выбросив из него каждый второй элемент(Освободившиеся
 * элементы заполнить нулями). Примечание. Дополнительный массив не использовать
 */

public class Task10 {

    public static int[] createArray(int[] array) {
        for (int i = 1; i < array.length; i = i + 2) {
            array[i] = 0;
        }

        return array;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0;

        System.out.println("Enter size of array: ");
        while (true) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Enter size of array: ");
            }

            n = scanner.nextInt();

            if (n > 0) {
                break;
            } else {
                System.out.println("Enter size of array: ");
            }
        }

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) - 25;
        }

        createArray(array);
    }
}
