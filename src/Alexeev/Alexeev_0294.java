package Alexeev;

import java.util.Scanner;

public class Alexeev_0294 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int l1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int l2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int a1 = k1 * l1 / 100;
        int a2 = k2 * l2 / 100;
        int s = a1 * m1 + a2 * m2;
        int r1 = k1 - a1;
        int r2 = k2 - a2;
        if (r1 > r2) {
            s += (r1 - r2) * m1;
        } else {
            s += (r2 - r1) * m2;
        }
        System.out.println(s);
    }
}