package Codeforces;

import java.io.*;

public class Razvedka_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] ars = br.readLine().split(" ");
        int min = Math.abs(Integer.parseInt(ars[0]) - Integer.parseInt(ars[n - 1]));
        int l = 0, j = 1;
        int m = min;
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(ars[i]);
            int b = Integer.parseInt(ars[i+1]);
            min = Math.min(Math.abs(a - b), min);
            if (l != min) {
                j = i + 1;
                l = min;
            }
        }
        System.out.println(m == min ? 1 + " " + n : j + " " + (j + 1));
    }
}