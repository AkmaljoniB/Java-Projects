package Codeforces;

import java.util.Scanner;

public class Thousand_tons_of_TNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            long maxx = 0;
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    long min = Long.MAX_VALUE, max = 0;
                    for (int j = 0; j < n; j += i) {
                        long s = 0;
                        for (int k = j; k < j + i; k++) s += arr[k];
                        max = Math.max(max, s);
                        min = Math.min(min, s);
                    }
                    maxx = Math.max(maxx, max - min);
                }
            }
            System.out.println(maxx);
        }
    }
}
