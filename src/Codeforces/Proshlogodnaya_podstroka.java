package Codeforces;

import java.io.*;

public class Proshlogodnaya_podstroka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n =br.readLine();
            String s = br.readLine();
            if (s.substring(0, 4).equals("2020") || (s.substring(0, 3).equals("202") && s.substring(s.length() - 1).equals("0")) || (s.substring(0, 2).equals("20") && s.substring(s.length() - 2).equals("20")) || (s.substring(0, 1).equals("2") && s.substring(s.length() - 3).equals("020")) || s.substring(s.length() - 4).equals("2020")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}