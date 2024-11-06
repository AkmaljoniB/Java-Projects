package Codeforces;

import java.io.*;

public class Ocherednoe_pririvanie_sen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int k = 0;
            String[] ars = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                k += Integer.parseInt(ars[i]);
            }
            System.out.println(k % n == 0 ? k / n : k / n + 1);
        }
    }
}