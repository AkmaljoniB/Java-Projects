package Alexeev;

import java.util.Scanner;

public class Alexeev_0493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] arr = new String[n];
        int k = 0;
        for (int i = 0; i < n; i++) arr[i] = scanner.next();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String s = "";
                if (j != 0 && j != m - 1) s = arr[i].substring(j - 1, j + 2);
                else if (j == 0 && j == m - 1) s = arr[i].substring(j, j + 1);
                else if (j == 0) s = arr[i].substring(j, j + 2);
                else if (j == m - 1) s = arr[i].substring(j - 1, j + 1);
                if (i != 0 && i != n - 1) s = s.concat(arr[i - 1].substring(j, j + 1) + arr[i + 1].substring(j, j + 1));
                else if (i == 0 && i == n - 1) s = s.concat(arr[i].substring(j, j + 1));
                else if (i == 0) s = s.concat(arr[i + 1].substring(j, j + 1));
                else if (i == n - 1) s = s.concat(arr[i - 1].substring(j, j + 1));
                if (!s.contains("*")) k++;
            }
        }
        System.out.println(k);
    }
}
