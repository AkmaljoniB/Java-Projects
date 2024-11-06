package Codeforces;

import java.util.Scanner;

public class Mocha_and_Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            for (int i = 1; i < n; i++) {
                int b =scanner.nextInt();
                a = a&b;
            }
            System.out.println(a);
        }
    }
}