package Codeforces;

import java.io.*;

public class Tretya_zadacha_o_tryokh_number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 == 0) {
                System.out.println("0  " +(n/2)+" "+(n/2));
            } else {
                System.out.println(-1);
            }
        }
    }
}