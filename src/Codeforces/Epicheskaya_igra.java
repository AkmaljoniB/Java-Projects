package Codeforces;

import java.io.*;

public class Epicheskaya_igra {
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ars = br.readLine().split(" ");
        int n = Integer.parseInt(ars[2]);
        int z = 0;
        while (n >= 0){
            n-=gcd(Integer.parseInt(ars[z]),n);
            z^=1;
        }
        System.out.println(z);
    }
}