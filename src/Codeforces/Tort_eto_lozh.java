package Codeforces;

import java.io.*;

public class Tort_eto_lozh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String[] ars = br.readLine().split(" ");
            int n = Integer.parseInt(ars[0]);
            int m = Integer.parseInt(ars[1]);
            int k = Integer.parseInt(ars[2]);
            System.out.println(n * m - 1 == k ? "YES" : "NO");
        }
    }
}