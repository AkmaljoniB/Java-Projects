package Codeforces;

import java.util.Scanner;

public class Dreamoon_and_WIFI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        int x = s1.replace("-", "").length();
        int y = s2.length() - s2.replace("+", "").length();
        int n = s2.length() - s2.replace("?", "").length();
        int r = x - y;
        if (n < r || r < 0) System.out.println("0.0");
        else System.out.println(f(n) / (f(n - r) * f(r)) / Math.pow(2, n));
    }

    static int f(int n) {
        return n == 0 ? 1 : n * f(n - 1);
    }
}
