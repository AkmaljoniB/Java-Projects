package Codeforces;

import java.io.*;

public class Selochislennie_deystviya {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int x = Integer.parseInt(ars[0]);
            int y = Integer.parseInt(ars[1]);
            double a = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            int l = 2;
            if (x == y && y == 0) {
                l = 0;
            } else if (a == (int) a) {
                l = 1;
            }
            System.out.println(l);
        }
    }
}
