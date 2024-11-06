package Codeforces;

import java.io.*;

public class Progulka_po_alee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String ars[];
        int m;
        while (t-- > 0) {
            int s = 0;
            ars = br.readLine().split(" ");
            m = Integer.parseInt(ars[1]);
            ars = br.readLine().split(" ");
            for (int i = 0; i < ars.length; i++) {
                s += Integer.parseInt(ars[i]);
            }
            System.out.println(s - m < 0 ? "0" : s - m);
        }
    }
}
