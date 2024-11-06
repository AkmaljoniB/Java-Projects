package Codeforces;

import java.util.Scanner;

public class Maksimum_v_tablitse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int j = 0; j < n; j++) {
            arr[0][j] = 1;
            arr[j][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
            }
        }
        System.out.println(arr[n-1][n-1]);
    }
}