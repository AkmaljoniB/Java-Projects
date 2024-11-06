package Codeforces;

import java.util.Scanner;

public class Route_setup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long s = 0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                s += a;
            }
            if (s % n == 0) System.out.println(0);
            else System.out.println((n - (s % n)) * (s % n));
        }
    }
}
