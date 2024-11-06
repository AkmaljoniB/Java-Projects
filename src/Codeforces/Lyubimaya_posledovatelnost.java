package Codeforces;

import java.util.Scanner;

public class Lyubimaya_posledovatelnost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int k = 0, l = 0;
            if (n % 2 != 0) {
                k = 1;
            }
            for (int i = 0; i < n / 2 + k; i++) {
                int a = scanner.nextInt();
                if (i % 2 == 0) {
                    arr[i + l] = a;
                } else {
                    arr[i + 1 + l] = a;
                    l += 2;
                }
            }
            l = 0;
            for (int i = n - 1 - k; i >= n / 2; i--) {
                int a = scanner.nextInt();
                if ((n - i-k) % 2 != 0) {
                    arr[i - l] = a;
                } else {
                    arr[i - 1 - l] = a;
                    l += 2;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}