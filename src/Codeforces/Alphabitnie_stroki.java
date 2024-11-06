package Codeforces;

import java.io.*;

public class Alphabitnie_stroki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s;
        while (t --> 0) {
            s = br.readLine();
            int p = s.indexOf("a");
            int k = p - 1, l = p + 1, m = 1;
            if (p == -1) {
                m = 0;
            } else {
                for (int i = 1; i <= s.length(); i++) {
                    if (k >= 0 && s.codePointAt(p) - s.codePointAt(k) == -m) {
                        k--;
                    } else if (l < s.length() && s.codePointAt(p) - s.codePointAt(l) == -m) {
                        l++;
                    } else {
                        break;
                    }
                    m++;
                }
            }
            System.out.println(m == s.length() ? "YES" : "NO");
        }
    }
}