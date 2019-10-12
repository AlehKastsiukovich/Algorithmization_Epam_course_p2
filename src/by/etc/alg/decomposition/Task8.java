package by.etc.alg.decomposition;


import java.util.Arrays;
import java.util.Scanner;

/**
Задан массив. Составить метод суммы трех последовательно находящихся элементов
 */

public class Task8 {
    public static int [] initArray() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter number of array elements: ");
        n = scanner.nextInt();

        int [] array = new int[n];

        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100-50);
        }

        System.out.println("Created array: "+ Arrays.toString(array));
        return array;
    }

    public static void sumOfThree(int [] array) {
        Scanner scanner = null;
        int element;

        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("Enter element: ");
            element = scanner.nextInt();
            if (element >= 0 && element < array.length - 2) {
                break;
            } else {
                System.out.println("You enter wrong number, try again: ");
            }
        }

        int sum = array[element] + array[element + 1] + array[element + 2];
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        sumOfThree(initArray());
    }
}
