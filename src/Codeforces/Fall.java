package Codeforces;

import java.util.Scanner;

public class Fall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String[][] arr = new String[n][m];
            for (int i = 0; i < n; i++) arr[i] = scanner.next().split("");
            for (int j = 0; j < m; j++) {
                int k = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i][j].equals("*")) {
                        k++;
                        arr[i][j] = ".";
                    }
                    if (arr[i][j].equals("o")) {
                        for (int l = i-1; l >= i - k; l--) arr[l][j] = "*";
                        k = 0;
                    }
                }
                for (int l = n - 1; l >= n - k; l--) arr[l][j] = "*";
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) System.out.print(arr[i][j]);
                System.out.println();
            }
            System.out.println();
        }
    }
}

