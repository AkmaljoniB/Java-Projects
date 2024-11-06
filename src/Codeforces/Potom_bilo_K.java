package Codeforces;

import java.io.*;

public class Potom_bilo_K {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            if (a == 1) {
                System.out.println(0);
            } else {
                int k = 3;
                while (k < a) {
                    k = k * 2 + 1;
                }
                System.out.println((k - 1) / 2);
            }
        }
    }
}