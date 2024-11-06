package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ustoichivaya_rasstanovka_ladey {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int n = Integer.parseInt(ars[0]);
            int k = Integer.parseInt(ars[1]);
            if ((n + n % 2) / 2 >= k) {
                ars = new String[n];
                String s = "........................................";
                s = s.substring(0, n);

                for (int i = 0; i < n; i++) {
                    ars[i] = s;
                }
                for (int i = 0; i < k; i++) {
                    ars[i * 2] = ars[i * 2].substring(0, i * 2) + "R" + ars[i].substring(i * 2 + 1);
                }
                for (int i = 0; i < n; i++) {
                    System.out.println(ars[i]);
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}