package by.etc.alg.decomposition;


import java.util.Scanner;

/**
 * Вычислить площадь правильного шестиугольника со стороной а. Использую метод вычисления площади треугольника
 * */

public class Task3 {
    private static double a;

    public static double triangleSquare(double a) {
        return ((Math.sqrt(3)) / 4) * Math.pow(a, 2);
    }

    public static double hexagonSquare(double square) {
        double hexSqr = square * 6;
        return  hexSqr;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");

        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("Enter a: ");
        }

        a = scanner.nextDouble();

        double trSqr = triangleSquare(a);
        System.out.println("Hexagon square is " + hexagonSquare(trSqr));
    }
}
