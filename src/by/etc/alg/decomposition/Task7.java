package by.etc.alg.decomposition;


/**
Вычислить сумму факториалов нечетных чисел от 1 до 9.
 */

public class Task7 {

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static int sumOfOddFact() {
        int sum = 0;

        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                sum += factorial(i);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfOddFact());
    }
}
