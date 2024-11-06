package Alexeev;

import java.util.Scanner;

public class Alexeev_0061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0, d = 0;
        for (int i = 0; i < 4; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c += a;
            d += b;
        }
        if (c > d) {
            System.out.println(1);
        }
        if (d > c) {
            System.out.println(2);
        }
        if (c == d) {
            System.out.println("DRAW");
        }
    }
}