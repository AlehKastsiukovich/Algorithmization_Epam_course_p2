package by.etc.alg.sort;


/**
 * Сортировка вставками. Дана последовательность чисел a1, a2...an.  Требуется переставить числа в порядке
 * возрастания. Пусть а1, а2, аi - упорядоченная последовательность. Т.е а1 <= a2 и т.д. Берется следующее
 * число аi+1 и всталяется в последовательность так, чтобы новая последовательность была тоже ворастающей.
 * Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. Место помещения
 * очередного элемента в отсортированную часть производить с помощью двоичного поиска. Двоичный поиск
 * офрмит в виде отдельной функции.
 */

public class Task5 {
    public static int binarySearch(int arr[], int low, int high, int value) {
        if (low == high) {
            return low;
        }

        int mid = low + ((high - low) / 2);

        if (value > arr[mid]) {
            return binarySearch(arr, mid + 1, high, value);
        } else if (value < arr[mid]) {
            return binarySearch(arr, low, mid, value);
        }

        return mid;
    }

    public static int[] binaryInsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int ins = binarySearch(arr, 0, i, arr[i]);
            int value = arr[i];
            int j = i - 1;

            while (j >= ins) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                j--;
            }

            arr[ins] = value;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, -100, 5, 200, 14, 22};

        int[] sorted = binaryInsertionSort(arr);
    }
}
