package Codeforces;

import java.util.Scanner;

public class Not_neighoring_matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n > 2) {
                int a = 1, b = n * n, l = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (l == 0) {
                            if (i == n - 1 && j == n - 1) {
                                System.out.print((n * n) + " ");
                            } else {
                                System.out.print(a + " ");
                            }
                            l++;
                            a++;
                        } else {
                            if (i == 0 && j == 1) {
                                System.out.print((n * n / 2 + 1) + " ");
                            } else if (i == n - 1 && j == n - 1) {
                                System.out.print((n * n) + " ");
                            } else {
                                System.out.print(b + " ");
                            }
                            l--;
                            b--;
                        }
                    }
                    System.out.println();
                }
            } else if (n == 1) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
