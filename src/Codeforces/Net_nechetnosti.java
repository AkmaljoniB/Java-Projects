package Codeforces;

import java.io.*;

public class Net_nechetnosti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int[] arr = new int[n];
            int k = 0, l = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ars[i]);
                if (arr[i] % 2 == 0) {
                    k++;
                } else {
                    l++;

                }
            }
            System.out.println(Math.min(l, k));
        }
    }
}