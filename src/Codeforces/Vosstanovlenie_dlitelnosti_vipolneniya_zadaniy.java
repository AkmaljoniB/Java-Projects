package Codeforces;

import java.io.*;

public class Vosstanovlenie_dlitelnosti_vipolneniya_zadaniy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int l,m,p;
            String[] s = br.readLine().split(" ");
            String[] f = br.readLine().split(" ");
            pr.print((Integer.parseInt(f[0])-Integer.parseInt(s[0])) + " ");
            for (int i = 1; i < n; i++) {
                l = Integer.parseInt(s[i]);
                m = Integer.parseInt(f[i]);
                p = Integer.parseInt(f[i - 1]);

                if (l > p) pr.print((m-l) + " ");
                else pr.print((m - p) + " ");
            }
            pr.println();
        }
        pr.close();
    }
}