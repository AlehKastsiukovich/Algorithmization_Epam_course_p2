package by.etc.alg.decomposition;


import java.util.Scanner;

/**
Написать метод для нахождения нод и нок по формуле.
 */

public class Task1 {
    private static int a;
    private static int b;

    public static void main(String[] args) {
        readData();
        System.out.println(findNok(findNod(a, b)));
    }

    public static void readData() {
        Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
    }

    public static int findNod(int a, int b) {
        while(b != 0) {
            int temp = a%b;
            System.out.println(temp);
            a = b;
            b = temp;
        }
        return a;
    }

    public static int findNok(int nod) {
        return a * b / findNod(a, b);
    }
}
