package Codeforces;

import java.io.*;

public class Anton_sifri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[]ars=br.readLine().split(" ");
        int k2 = Integer.parseInt(ars[0]);
        int k3 = Integer.parseInt(ars[1]);
        int k5 = Integer.parseInt(ars[2]);
        int k6 = Integer.parseInt(ars[3]);
        long sum =0;
        int min = Math.min(k2,Math.min(k5,k6));
        k2-=min;
        sum+=min*256;
        min = Math.min(k2,k3);
        sum+=min*32;
        System.out.println(sum);
    }
}
//        ∞