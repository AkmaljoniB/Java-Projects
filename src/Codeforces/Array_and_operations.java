package Codeforces;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Array_and_operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long min = 0;
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            int max = 0, p = 0;
            for (int i = n - k * 2; i < n - 1; i++) {
                if (Objects.equals(arr[i], arr[i + 1])) p++;
                else {
                    if (p != 0) max = Math.max(max, p + 1);
                    p = 0;
                }
            }
            if (p != 0) max = Math.max(max, p + 1);
            if (max > k) min = max - k;
            for (int i = 0; i < n - k * 2; i++) min += arr[i];
            System.out.println(min);
        }
    }
}