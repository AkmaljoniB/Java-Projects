package Codeforces;

import java.util.Scanner;

public class DZY_loves_the_chessboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] arr = new String[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next();
            for (int j = 0; j < m; j++) {
                if (arr[i].charAt(j) == '.') {
                    if (k == 0) arr[i] = arr[i].substring(0, j) + "B" + arr[i].substring(j + 1);
                    else arr[i] = arr[i].substring(0, j) + "W" + arr[i].substring(j + 1);
                }
                k ^= 1;
            }
            if (m % 2 == 0) k ^= 1;
        }
        for (int i = 0; i < n; i++) System.out.println(arr[i]);

    }
}