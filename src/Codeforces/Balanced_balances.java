package Codeforces;

import java.util.Scanner;

public class Balanced_balances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int c0 = 0, c1 = 0, c2 = 0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (a % 3 == 0) c0++;
                else if (a % 3 == 1) c1++;
                else c2++;
            }
            int k = 0;
            if (c0 < n / 3) {
                if (c1 > n / 3) {
                    k += Math.min((n / 3) - c0,c1-n/3) * 2;
                    c1+=Math.min((n / 3) - c0,c1-n/3);
                }
                if (c2>n/3)k += Math.min((n / 3) - c0,c2-n/3);
            }
            if (c1 < n / 3) {
                if (c2 > n / 3) {
                    k += Math.min((n / 3) - c1,c2-n/3) * 2;
                    c1+=Math.min((n / 3) - c1,c2-n/3);
                }
                if (c0>n/3)k += Math.min((n / 3) - c1,c0-n/3);
            }
            if (c2 < n / 3) {
                if (c0 > n / 3) {
                    k += Math.min((n / 3) - c2, c0 - n / 3) * 2;
                    c2 += Math.min((n / 3) - c2, c0 - n / 3);
                }
                if (c1 > n / 3) k += Math.min((n / 3) - c2, c1 - n / 3);
            }
            System.out.println(k);
        }
    }
}
