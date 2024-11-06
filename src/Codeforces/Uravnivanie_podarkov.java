package Codeforces;

import java.util.Scanner;

public class Uravnivanie_podarkov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            long k = 0;
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr1[i] = scanner.nextInt();
                min1 = Math.min(min1, arr1[i]);
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = scanner.nextInt();
                min2 = Math.min(min2, arr2[i]);
            }
            for (int i = 0; i < n; i++) {
                int min = Math.min(arr1[i] - min1, arr2[i] - min2);
                arr1[i] -= min;
                arr2[i] -= min;
                k += min;
            }
            for (int i = 0; i < n; i++) {
                if (arr1[i] != min1) {
                    k += arr1[i] - min1;
                    arr1[i] = arr1[i] - (arr1[i] - min1);
                }
                if (arr2[i] != min2) {
                    k += arr2[i] - min2;
                    arr2[i] = arr2[i] - (arr2[i] - min2);
                }
            }
            System.out.println(k);
        }
    }
}