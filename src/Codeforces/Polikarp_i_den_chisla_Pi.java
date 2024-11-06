package Codeforces;

import java.io.*;

public class Polikarp_i_den_chisla_Pi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s = "314159265358979323846264338327";
        while (t-- > 0) {
            String n = br.readLine();
            int k = n.length();
            for (int i = 0; i < n.length(); i++) {
                if (!n.substring(0, i + 1).equals(s.substring(0, i + 1))) {
                    k = i;
                    break;
                }
            }
            System.out.println(k);
        }
    }
}