package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Slovar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int a = s.codePointAt(0) - 97;
            int b = s.codePointAt(1) - 97;
            System.out.println(a < b ? a * 25 + b : a * 25 + b + 1);
        }
    }
}