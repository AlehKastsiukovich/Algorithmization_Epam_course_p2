package by.etc.alg.decomposition;

import java.util.Scanner;

/**
 * Вычислить площадь правильного шестиугольника со стороной а. Использую метод вычисления площади треугольника
 * */

public class Task3 {
    private static double square;
    private static double a;
    private static Scanner scanner = new Scanner(System.in);

    public static void  initA() {
        System.out.println("Enter side a: ");
        a = scanner.nextDouble();
    }

    public static double triangleSquare() {
        return ((Math.sqrt(3)) / 4) * Math.pow(a, 2);
    }

    public static void hexagonSquare() {
        square = triangleSquare() * 6;
        System.out.println(square);
    }


    public static void main(String[] args) {
        initA();
        hexagonSquare();
    }
}
