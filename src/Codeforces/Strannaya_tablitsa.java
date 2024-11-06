package Codeforces;

import java.io.*;

public class Strannaya_tablitsa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String[] ars = br.readLine().split(" ");
            long n = Long.parseLong(ars[0]);
            long m = Long.parseLong(ars[1]);
            long x = Long.parseLong(ars[2]);
            if (x % n == 0) {
                System.out.println((n - 1) * m + x / n);
            } else {
                System.out.println((x % n - 1) * m + 1 + x / n);
            }
        }
    }
}