package Codeforces;

import java.io.*;

public class Sayt_otzivov {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (Integer.parseInt(ars[i]) % 2 != 0) {
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}