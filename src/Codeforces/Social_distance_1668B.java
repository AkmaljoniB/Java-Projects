package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Social_distance_1668B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            long s = arr[0] * 2L + 1;
            for (int i = 1; i < n - 1; i++) s += arr[i] + (arr[i] - arr[i - 1]) + 1;
            s += arr[n - 1] - arr[n - 2] + 1 + arr[n - 1] - arr[0];
            if (s <= m) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
