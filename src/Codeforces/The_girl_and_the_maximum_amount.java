package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class The_girl_and_the_maximum_amount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[]arr =new int[n];
        int[]ar1 =new int[n+1];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        long s = 0;
        while (q-- > 0) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            ar1[l-1]++;
            ar1[r]--;
        }
        for (int i = 1; i <= n; i++) ar1[i]+=ar1[i-1];
        Arrays.sort(ar1);
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) s += (long) arr[i] * ar1[i+1];
        System.out.println(s);
    }
}
