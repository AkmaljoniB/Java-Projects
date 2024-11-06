package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Points_and_minimum_distanse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n * 2];
            for (int i = 0; i < arr.length; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            int s = 0, k = 0;
            int[] x = new int[n];
            int[] y = new int[n];
            for (int i = arr.length - 1; i > 0; i--) {
                if (i == n) {
                    x[0] = arr[i];
                    y[0] = arr[0];
                    i--;
                }
                if (i > n) {
                    if (i % 2 == 0) x[i / 2 - k] = arr[i];
                    else {
                        x[i / 2 - k] = arr[i];
                        k++;
                    }
                } else y[i] = arr[i];
                s += Math.abs(arr[i] - arr[i - 1]);
            }
            System.out.println(s);
            for (int i = 0; i < n; i++) System.out.println(y[n - 1 - i] + " " + x[i]);
        }
    }
}