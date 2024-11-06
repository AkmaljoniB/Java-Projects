package Codeforces;

import java.io.*;

public class Vichitat_ili_delit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int k = 0;
            while (n != 1) {
                if (n < 4) {
                    k+=n-1;
                    break;
                } else if (n % 2 == 0) {
                    n = n / (n / 2);
                } else {
                    n --;
                }
                k++;
            }
            System.out.println(k);
        }
    }
}