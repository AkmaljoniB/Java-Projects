package Codeforces;

import java.util.Scanner;

public class Table_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] arr = new int[n][m];
            int k = 0;
            for (int i = 0; i < n; i++) {
                int p = 0;
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scanner.nextInt();
                    if (arr[i][j] != 0) p++;
                }
                if (p == 0) k++;
            }
            int f=0;
            for (int i = 0; i < m; i++) {
                int p = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j][i] != 0) p++;
                }
                if (p == 0) f++;
            }
            System.out.println(Math.min(f,k)%2!=0?"Ashish":"Vivek");
        }
    }
}
