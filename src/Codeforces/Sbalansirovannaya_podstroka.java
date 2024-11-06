package Codeforces;

import java.io.*;

public class Sbalansirovannaya_podstroka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            String s = br.readLine();
            for (int i = 0; i < s.length()-1; i++) {
                if (!s.substring(i, i + 1).equals(s.substring(i + 1, i + 2))) {
                    n = (i + 1) + " " + (i + 2);
                    break;
                }
            }
            System.out.println(n.length() < 3 ? "-1 -1" : n);
        }
    }
}