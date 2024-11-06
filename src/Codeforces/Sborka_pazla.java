package Codeforces;

import java.io.*;

public class Sborka_pazla {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int n = Integer.parseInt(ars[0]);
            int m = Integer.parseInt(ars[1]);
            String s = "NO";
            if (n == 1 || m == 1 || (n == 2 && m == 2)) {
                s = "YES";
            }
            System.out.println(s);
        }
    }
}