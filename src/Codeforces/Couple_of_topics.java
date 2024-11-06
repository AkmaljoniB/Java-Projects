package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Couple_of_topics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) arr[i] = a[i] - scanner.nextInt();
        Arrays.sort(arr);
        int i = 0, j = n - 1;
        long k = 0,p=0;
        while (i < n - 1) {
            if (i > j) {
                p--;
                k += p;
                i++;
            } else if (arr[i] + arr[j] > 0) {
                p++;
                j--;
            } else {
                k += p;
                i++;
            }
        }
        System.out.println(k);
    }
}