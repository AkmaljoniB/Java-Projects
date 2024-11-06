package Codeforces;

import java.util.Scanner;

public class Make_the_product_a_unit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = 0;
        int l = 0, p = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a >= 1) k += a - 1;
            else if (a == 0) {
                k++;
                p++;
            } else {
                k += Math.abs(a) - 1;
                l ^= 1;
            }
        }
        if (l == 1 && p == 0) k += 2;
        System.out.println(k);
    }
}
