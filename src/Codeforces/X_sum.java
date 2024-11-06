package Codeforces;

import java.util.Scanner;

public class X_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int s = 0;
                    for (int k = 0; i + k < n && j + k < m; k++) s += arr[i + k][j + k];
                    for (int k = 1; i - k >= 0 && j - k >= 0; k++) s += arr[i - k][j - k];
                    for (int k = 1; i + k < n && j - k >= 0; k++) s += arr[i + k][j - k];
                    for (int k = 1; i - k >= 0 && j + k < m; k++) s += arr[i - k][j + k];
                    max = Math.max(s, max);
                }
            }
            System.out.println(max);
        }
    }
}
