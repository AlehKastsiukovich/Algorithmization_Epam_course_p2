package by.etc.alg.decomposition;


import java.util.Scanner;

/**
нахождение нод для 4-х чисел.
 */

public class Task2 {
    private static int a;
    private static int b;
    private static int c;
    private static int d;

    public static void readData() {
        Scanner scanner = new Scanner(System.in);

        inputCheck(scanner);
        a = scanner.nextInt();

        inputCheck(scanner);
        b = scanner.nextInt();

        inputCheck(scanner);
        c = scanner.nextInt();

        inputCheck(scanner);
        d = scanner.nextInt();
    }

    public static void inputCheck(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
    }

    public static int findNod(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        readData();
        System.out.println(findNod(a,findNod(b,findNod(c,d))));
    }
}
