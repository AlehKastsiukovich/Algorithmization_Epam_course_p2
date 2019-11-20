package by.etc.alg.onedimarray;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Дан массив действительных чисел, размерность которого N. Посчитать сколько в нем отрицательных,
 *  положительных и нулевых элементов.
 */

public class Task3 {
    private static int [] array;
    private static int n;

    public static void findSolution() {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > 0) {
                posCount++;
            } else if(array[i] < 0) {
                negCount++;
            } else if(array[i]==0) {
                zeroCount++;
            }
        }

        System.out.println("Number of positive elements: " + posCount);
        System.out.println("Number of negative elements: " + negCount);
        System.out.println("Number of zero elements: " + zeroCount);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter array size: ");
        while (true) {

            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Enter array size: ");
            }
            n = scanner.nextInt();
            if (n > 0) {
                break;
            } else {
                System.out.println("Enter array size: ");
            }
        }

        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }

        System.out.println(Arrays.toString(array));

        findSolution();
    }
}
