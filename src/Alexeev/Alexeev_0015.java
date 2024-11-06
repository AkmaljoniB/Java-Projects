package Alexeev;

import java.util.Scanner;

public class Alexeev_0015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] == 1) {
                    a++;
                }
            }
        }
        System.out.println(a/2);
    }
}