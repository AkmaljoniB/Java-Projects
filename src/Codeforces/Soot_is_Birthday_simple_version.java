package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Soot_is_Birthday_simple_version {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        System.out.println((n-1) / 2);
        int i = 0, j = n - 1, k = 0;
        while (i <= j) {
            if (k == 1) {
                System.out.print(arr[i] + " ");
                i++;
            } else {
                System.out.print(arr[j] + " ");
                j--;
            }
            k ^= 1;
        }
        System.out.println();
    }
}
