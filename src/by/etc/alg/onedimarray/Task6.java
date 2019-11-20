package by.etc.alg.onedimarray;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера
 * котрых являются простыми числами.
 */

public class Task6 {

    public static boolean isSimple(int value) {
        for (int i = 2; i < value; i++) {

            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sumOfSimple(int[] array) {
        int sum = 0;

        for (int i = 2; i < array.length; i++) {

            if (isSimple(i)) {
                sum += array[i];
            }
        }
        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 9, 17, 7, 100, 555, 4};
        sumOfSimple(array);

    }
}
