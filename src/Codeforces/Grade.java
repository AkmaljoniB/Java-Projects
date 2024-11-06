package Codeforces;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] arr = new String[n];
        int[] ar = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) arr[i] = scanner.next();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int a = Integer.parseInt(arr[j].substring(i, i + 1));
                max = Math.max(max, a);
            }
            for (int j = 0; j < n; j++) if (arr[j].substring(i, i + 1).equals(String.valueOf(max))) ar[j]++;
            max=0;
        }
        int p = n;
        for (int i = 0; i < n; i++) if (ar[i] == 0)p--;
        System.out.println(p);
    }
}
