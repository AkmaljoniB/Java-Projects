package Codeforces;

import java.io.*;

public class Ezzat_i_dve_podposledovatelnosti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int j = 0; j < t; j++) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            double max = Double.parseDouble(ars[0]);
            double sum = max;
            for (int i = 1; i < n; i++) {
                int x = Integer.parseInt(ars[i]);
                sum += x;
                max = Math.max(max, x);
            }
            System.out.println((sum - max) / (n - 1) + max);
        }
    }
}