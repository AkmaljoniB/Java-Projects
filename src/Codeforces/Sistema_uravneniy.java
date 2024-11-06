package Codeforces;

import java.util.Scanner;

public class Sistema_uravneniy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = (int) Math.sqrt(n);
        int b = (int) Math.sqrt(m);
        int s = n - (a * a);
        int k = m - (b * b);
        if (s != b && k != a && a * a + s == n && a + s * s == m && k * k + b == n && k + b * b == m) {
            System.out.println(2);
        } else if ((a * a + s == n && a + s * s == m) || (k * k + b == n && k + b * b == m)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}