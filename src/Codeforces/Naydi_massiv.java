package Codeforces;

import java.io.*;

public class Naydi_massiv {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            int k = 1, l = 1, f = 3;
            while (k < n) {
                k += f;
                f += 2;
                l++;
            }
            System.out.println(l);
        }
    }
}