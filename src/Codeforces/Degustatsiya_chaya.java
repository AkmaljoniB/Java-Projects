package Codeforces;

import java.util.Scanner;

public class Degustatsiya_chaya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            int[] a1 = new int[n];
            int[] a2 = new int[n];
            long[] a3 = new long[n];
            for (int i = 0; i < n; i++) {
                a1[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                a2[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n - i; k++) {
                    int min = Math.min(a1[k], a2[k + i]);
                    a3[k + i] += min;
                    a1[k] -= min;
                }
                System.out.println(a3[i]);
            }
        }
    }
}