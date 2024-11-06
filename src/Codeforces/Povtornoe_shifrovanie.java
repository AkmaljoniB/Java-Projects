package Codeforces;

import java.io.*;

public class Povtornoe_shifrovanie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int k=0;
        for (int i = 0; i < t; i+=k) {
            k++;
            System.out.print(s.substring(i,i+1));
        }
    }
}