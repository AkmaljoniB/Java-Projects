package Codeforces;

import java.io.*;

public class Rasshifruy_stroku {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            String alphabit = "abcdefghijklmnopqrstuvwxyz";
            String s = br.readLine();
            String s1 ="";
            for (int i = s.length() - 1; i >= 0; i--) {
                int l=0;
                if (s.substring(i,i+1).equals("0")){
                    l =Integer.parseInt(s.substring(i-2,i));
                    i-=2;
                } else {
                    l = Integer.parseInt(s.substring(i, i + 1));
                }
                s1 = alphabit.substring(l - 1, l) + s1;
            }
            System.out.println(s1);
        }
    }
}