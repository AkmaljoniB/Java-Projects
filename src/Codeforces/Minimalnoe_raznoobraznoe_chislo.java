package Codeforces;

import java.io.*;

public class Minimalnoe_raznoobraznoe_chislo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int k = 0;
            String ans = "";
            for (int i = 9; i >= 1; i--) {
                if (n >= i) {
                    ans = i + ans;
                    n-= i;
                } else {
                    break;
                }
            }
            System.out.println(n!=0 ? n + ans : ans);
        }
    }
}