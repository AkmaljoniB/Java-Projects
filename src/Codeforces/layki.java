package Codeforces;

import java.io.*;

public class layki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int[] arr = new int[n];
            int l = 0, k = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ars[i]);
                if (arr[i] > 0) l++;
                if (arr[i] < 0) k++;
            }
            for (int i = 1; i <= l; i++) {
                System.out.print(i + " ");
            }
            for (int i = 1; i <= k; i++) {
                System.out.print((l - i) + " ");
            }
            System.out.println();
            int p = 1;
            l += k;
            while (l-- > 0) {
                System.out.print(p + " ");
                if (k > 0 && p > 0) {
                    p--;
                    k--;
                } else {
                    p++;
                }
            }
            System.out.println();
        }
    }
}