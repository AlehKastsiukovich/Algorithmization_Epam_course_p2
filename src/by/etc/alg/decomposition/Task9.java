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

    public static void readData() {
        System.out.println("Enter lengths of tetragon: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        t = scanner.nextInt();

        if (x < 0 || y < 0 || z < 0 || t < 0) {
            System.out.println("You enter wrong data.");
            readData();
        } else {
            System.out.println("Tetragon was created.");
        }
    }

    public static void сalculateSquare() {
        double s;
        double s1;
        double s2;
        double g;
        double p;

        g = Math.sqrt(x * x + y * y);
        s1 = x * y / 2;
        p = (z + t + g) / 2;
        s2 = Math.sqrt(p * (p - z) * (p - t) * (p - g));
        s = s1 + s2;

        System.out.println("Area of tetragon = " + s);

    }

    public static void main(String[] args) {
        readData();
        сalculateSquare();
    }
}
