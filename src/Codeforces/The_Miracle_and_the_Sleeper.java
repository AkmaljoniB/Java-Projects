package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class The_Miracle_and_the_Sleeper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a, b, l;
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            a = Integer.parseInt(ars[1]);
            b = Integer.parseInt(ars[0]);
            l = Math.max(a / 2 + 1, b);
            System.out.println(a % l);
        }
    }
}