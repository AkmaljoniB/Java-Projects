package Codeforces;

import java.io.*;

public class Preobrazovanie_chisla {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int x = Integer.parseInt(ars[0]);
            int y = Integer.parseInt(ars[1]);
            System.out.println(y % x == 0 ? "1 " + (y / x) : "0 0");
        }
    }
}