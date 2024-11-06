package Codeforces;

import java.io.*;

public class Plokhoy_treugolnik {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            if (Integer.parseInt(ars[0])+Integer.parseInt(ars[1])<=Integer.parseInt(ars[n-1])){
                System.out.println("1 2 "+n);
            } else {
                System.out.println(-1);
            }
        }
    }
}