package Codeforces;

import java.util.Scanner;

public class Tricky_amount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextInt();
            long s = (1 + n) * n / 2, p = 1;
            while (p <= n) {
                p = p * 2;
                s -= p;
            }
            System.out.println(s);
        }
    }
}
