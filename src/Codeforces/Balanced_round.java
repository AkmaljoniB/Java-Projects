package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Balanced_round {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            int l = 0, max = 0;
            for (int i = 0; i < n-1; i++) {
                if (arr[i + 1] - arr[i] <= k) {
                    l++;
                } else {
                    max = Math.max(l, max);
                    l=0;
                }
            }
            max= Math.max(max,l);
            System.out.println(n-max-1);
        }
    }
}
