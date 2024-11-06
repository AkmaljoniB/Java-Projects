package Alexeev;

import java.util.Scanner;

public class Alexeev_0926 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] ars = new String[n];
        int[][] arr = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            ars[i] = scanner.next();
            k += ars[i].replace("D", "").length();
        }
        k /= 2;
        for (int i = 0; i < n; i++) {
            k -= ars[i].replace("D", "").length();
            if (k <= 0) {
                k += ars[i].replace("D", "").length();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 1;
                    if (ars[i].charAt(j) == 'C') {
                        k--;
                        if (k == 0) break;
                    }
                }
                break;
            }
            for (int j = 0; j < n; j++) arr[i][j] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) System.out.print(2);
                else System.out.print(1);
            }
            System.out.println();
        }
    }
}
