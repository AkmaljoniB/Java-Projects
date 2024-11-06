package Codeforces;

import java.util.Scanner;

public class Feniks_i_balans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long s1 = (int) Math.pow(2, n);
            long s2 = 0;

            for (int j = 1; j < n / 2; j++) {
                s1 += Math.pow(2, j);
            }
            for (int j = n / 2; j < n; j++) {
                s2 += Math.pow(2, j);
            }
            System.out.println(s1 - s2);
        }
    }
}