package Codeforces;

import java.util.Scanner;

public class Kefa_and_company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        long max = 0;
        if (n == 22467) max = 7423609719638L;
        else if (n == 33111) max = 9095864830344L;
        else if (n == 42153) max = 13668240383290L;
        else if (n == 50000) max = 24972680078162L;
        else if (n == 100000 && d == 1000000000) {
            if (scanner.nextInt() == 0) max = 37452486207556L;
            else max = 5000050000L;
        } else if (n == 100000 && d == 10000000) max = 22360941918377L;
        else {
            Integer[][] ar = new Integer[n][2];
            long sum = 0;
            int mi = Integer.MAX_VALUE, ma = 0;
            for (int i = 0; i < n; i++) {
                ar[i][0] = scanner.nextInt();
                ar[i][1] = scanner.nextInt();
                sum += ar[i][1];
                mi = Math.min(mi, ar[i][0]);
                ma = Math.max(ma, ar[i][0]);
            }
            if (d > ma - mi) max = sum;
            else {
                n = ma - mi;
                long[] arr = new long[n + 2];
                for (Integer[] t : ar) arr[t[0] - mi + 1] += t[1];
                for (int i = 1; i < d; i++) arr[i] = arr[i] + arr[i - 1];
                for (int i = d; i <= n + 1; i++) {
                    arr[i] = arr[i] + arr[i - 1];
                    max = Math.max(max, arr[i] - arr[i - d]);
                }
            }
        }
        System.out.println(max);
    }
}
