package Codeforces;

import java.io.*;

public class Chotnoe_i_nechotnoe_inkrementi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int[] arr = new int[n];
            int q = 0, l = 0;
            String s = "YES";
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ars[i]);
                if (arr[i] % 2 == 0) q++;
                if (arr[i] % 2 != 0) l++;
            }
            if (q != n && l != n) {
                for (int i = 1; i < n; i++) {
                    if ((arr[i] % 2 == 0 && arr[i - 1] % 2 == 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 != 0)) {
                        s = "NO";
                        break;
                    }
                }
            }
            System.out.println(s);
        }
    }
}