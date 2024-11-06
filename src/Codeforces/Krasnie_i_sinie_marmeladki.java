package Codeforces;

import java.io.*;

public class Krasnie_i_sinie_marmeladki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String[] ars = br.readLine().split(" ");
            long r = Long.parseLong(ars[0]);
            long b = Long.parseLong(ars[1]);
            long d = Long.parseLong(ars[2]);
            long min = Math.min(r, b);
            long max = Math.max(r, b);
            System.out.println((d + 1) * min >= max ? "YES" : "NO");
        }
    }
}