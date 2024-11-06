package Codeforces;

import java.io.*;

public class Summa_sifr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            s = String.valueOf(Integer.parseInt(s)+1);
            System.out.println(s.length()!=1 ? s.substring(0,s.length()-1):"0");
        }
    }
}