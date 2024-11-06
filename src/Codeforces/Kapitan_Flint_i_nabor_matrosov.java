package Codeforces;

import java.io.*;

public class Kapitan_Flint_i_nabor_matrosov {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n > 30) {
                System.out.println("YES");
                int l = n - 30;
                if (l == 6 || l == 10 || l == 14) {
                    System.out.println("6 10 15 " + (n - 31));
                } else {
                    System.out.println("6 10 14 " + (n - 30));
                }
            } else System.out.println("NO");
        }
    }
}