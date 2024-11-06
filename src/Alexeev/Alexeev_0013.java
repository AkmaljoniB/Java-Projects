package Alexeev;

import java.util.Scanner;

public class Alexeev_0013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c, g, d, e, f, h;
        d = b % 10;
        e = b / 10 % 10;
        f = b / 100 % 10;
        h = b / 1000 % 10;
        int k = 0, l = 0;
        for (int i1 = 1; i1 < 1001; i1 = i1 * 10) {
            c = a / i1 % 10;
            g = b / i1 % 10;
            if (a >= 1000 && a <= 9999 && b >= 1000 && b <= 9999 && c == g) {
                k++;
            } else if (c == d || c == e || c == f || c == h) {
                l++;
            }
        }
        System.out.println(k);
        System.out.println(l);
    }
}