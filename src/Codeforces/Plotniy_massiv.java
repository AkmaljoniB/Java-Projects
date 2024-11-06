package Codeforces;

import java.io.*;

public class Plotniy_massiv {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int[] arr = new int[n];
            int k = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ars[i]);
                if (i != 0) {
                    double max = Math.max(arr[i], arr[i - 1]);
                    double min = Math.min(arr[i], arr[i - 1]);
                    while (max / min > 2) {
                        max/=2;
                        k++;
                    }
                }
            }
            System.out.println(k);
        }
    }
}