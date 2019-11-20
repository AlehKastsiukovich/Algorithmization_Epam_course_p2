package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Даны X, Y, Z, T - стороны четырехугольника. Уголь между Х и У прямой. Написать метод вычисления площади.
 */

public class Task9 {
    private static int x;
    private static int y;
    private static int z;
    private static int t;

    public static void generateTetragon() {
        x = input();
        y = input();
        z = input();
        t = input();

        System.out.println("Tetragon was created.");
    }

    public static int input() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int side;

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        while ((side = scanner.nextInt()) < 1) {
            System.out.println("The length of side must be > 0");
        }

        return side;
    }

    public static double сalculateSquare() {
        double tetrSquare;
        double s1;
        double s2;
        double g;
        double p;

        g = Math.sqrt(x * x + y * y);
        s1 = x * y / 2;
        p = (z + t + g) / 2;
        s2 = Math.sqrt(p * (p - z) * (p - t) * (p - g));
        tetrSquare = s1 + s2;

        return tetrSquare;
    }

    public static void main(String[] args) {
        generateTetragon();
        System.out.println(сalculateSquare());
    }
}
