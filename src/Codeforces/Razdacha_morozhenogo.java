package Codeforces;

import java.io.*;

public class Razdacha_morozhenogo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sr = br.readLine().split(" ");
        int n = Integer.parseInt(sr[0]);
        long k = Long.parseLong(sr[1]);
        int l = 0;
        for (int i = 0; i < n; i++) {
            sr = br.readLine().split(" ");
            if (sr[0].equals("+")) {
                k += Long.parseLong(sr[1]);
            } else {
                if (k >= Long.parseLong(sr[1])) {
                    k -= Long.parseLong(sr[1]);
                } else {
                    l++;
                }
            }
        }
        System.out.println(k);
        System.out.println(l);
    }
}