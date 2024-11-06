package Codeforces;

import java.io.*;

public class Min_maks_zameni {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int max = 0, min, p = 0;
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(ars[i]);
            }
            ars = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(ars[i]);
                max = Math.max(Math.max(max, arr1[i]), arr2[i]);
                min = Math.min(arr1[i], arr2[i]);
                if (min > p) {
                    p = min;
                }
            }
            System.out.println(p * max);
        }
    }
}