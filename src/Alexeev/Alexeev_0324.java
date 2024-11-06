package Alexeev;

import java.util.Scanner;

public class Alexeev_0324 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b, c, d, e;
        b = a % 10;
        c = a / 10 % 10;
        d = a / 100 % 10;
        e = a / 1000 % 10;
        if (b * 1000 + c * 100 + d * 10 + e == a && a < 10000 && a > 999) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}