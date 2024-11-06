package Codeforces;

import java.io.*;

public class Kodoviy_zamok {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s1 = br.readLine();
        String s2 = br.readLine();
        int k = 0;
        for (int i = 0; i < n; i++) {
            int min = Math.min(Math.abs(Integer.parseInt(s1.substring(i, i + 1)) - Integer.parseInt(s2.substring(i, i + 1))), Math.min(9 - Integer.parseInt(s1.substring(i, i + 1)) + Integer.parseInt(s2.substring(i, i + 1)) + 1,9-Integer.parseInt(s2.substring(i,i+1))+Integer.parseInt(s1.substring(i,i+1))+1));
            k += min;
        }
        System.out.println(k);
    }
}