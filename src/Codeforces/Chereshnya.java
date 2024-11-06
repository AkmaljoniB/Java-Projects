package Codeforces;

import java.io.*;

public class Chereshnya {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int[] arr = new int[n];
            long max = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ars[i]);
                if (i!=0) max = Math.max((long)arr[i-1]*(long)arr[i],max);
            }
            System.out.println(max);
        }
    }
}