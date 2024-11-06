package Codeforces;

import java.util.Scanner;

public class Lisa_i_zmeyka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                System.out.println();
            } else {
                l++;
                if (l % 2 != 0) {
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.println("#");
                } else {
                    System.out.print("#");
                    for (int j = 1; j < m; j++) {
                        System.out.print(".");
                    }
                    System.out.println();
                }
            }
        }
    }
}