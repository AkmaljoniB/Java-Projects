package Codeforces;

import java.util.Scanner;

public class C_plus_equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            int k = 0;
            while (max <= n) {
                int l = max;
                min += max;
                max = min;
                min = l;
                k++;
            }
            System.out.println(k);
        }
    }
}