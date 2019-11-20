package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Задан массив. Составить метод суммы трех последовательно находящихся элементов
 */

public class Task8 {

    public static int [] initArray() {
        int n = initArraySize();
        int [] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }

        return array;
    }

    public static int sumOfThree(int[] array, int element) {
        return array[element] + array[element + 1] + array[element + 2];
    }

    public static int initArraySize() {
        @SuppressWarnings("resouce")
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Enter n: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Enter n: ");
        }

        while ((n = scanner.nextInt()) < 3) {
            System.out.println("Enter a right number: ");
        }

        return n;
    }


    public static void main(String[] args) {
        int[] array = initArray();
        int element;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter element: ");
            element = scanner.nextInt();
            if (element >= 0 && element < array.length - 2) {
                break;
            } else {
                System.out.println("You enter wrong number, try again: ");
            }
        }

        System.out.println(sumOfThree(array, element));
    }
}
