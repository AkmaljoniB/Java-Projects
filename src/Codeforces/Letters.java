package Codeforces;

import java.util.*;

public class Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextLong();
        long s = 0;
        int k=0;
        for (int i = 0; i < m; i++) {
            long c = scanner.nextLong();
            for (int j = k; j <= n; j++) {
                if (s >= c) {
                    if (j == 1) System.out.println(j + " " + c);
                    else System.out.println(j + " " + (c-(s-a[j-1])));
                    break;
                }
                s+=a[j];
                k++;
            }
        }
    }
}
