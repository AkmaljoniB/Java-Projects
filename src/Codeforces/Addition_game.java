package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Addition_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt(), x = sc.nextInt();
            Integer[] arr = new Integer[n];
            long s = 0, max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                s += arr[i];
            }
            Arrays.sort(arr);
            long p = 0;
            for (int j = n - 1; j > n - 1 - x && j >= 0; j--) p += arr[j];
            max = Math.max(max, s - p - p);
            for (int i = n - 1; i > n - 1 - k && i >= 0; i--) {
                p -= arr[i];
                if (i - x >= 0) p += arr[i - x];
                max = Math.max(max, s - arr[i] - p - p);
                s -= arr[i];
            }
            System.out.println(max);
        }
    }
}
