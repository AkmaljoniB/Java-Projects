package Codeforces;

import java.util.Scanner;

public class Otrisatelnoe_i_polozhitelnoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long s = 0, k = 0, min = Integer.MAX_VALUE;
            for (long j = 0; j < n; j++) {
                long a = scanner.nextLong();
                if (a < 0) {
                    k++;
                }
                s += Math.abs(a);
                min = Math.min(min, Math.abs(a));
            }
            if (k % 2 == 0) {
                System.out.println(s);
            } else {
                System.out.println(s - (min * 2));
            }
        }
    }
}