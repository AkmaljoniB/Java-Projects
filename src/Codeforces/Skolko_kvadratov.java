package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Skolko_kvadratov {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            long n = Long.parseLong(ars[0]);
            long s = Long.parseLong(ars[1]);
            System.out.println(s/(n*n));
        }
    }
}