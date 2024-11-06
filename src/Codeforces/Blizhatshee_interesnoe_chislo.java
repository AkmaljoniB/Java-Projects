package Codeforces;

import java.io.*;

public class Blizhatshee_interesnoe_chislo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            l += Integer.parseInt(s.substring(i, i + 1));
        }
        while (l % 4 != 0) {
            s = String.valueOf(Integer.parseInt(s)+1);
            l = 0;
            for (int i = 0; i < s.length(); i++) {
                l += Integer.parseInt(s.substring(i, i + 1));
            }
        }
        System.out.println(s);
    }
}