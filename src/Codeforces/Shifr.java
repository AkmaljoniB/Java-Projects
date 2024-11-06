package Codeforces;

import java.io.*;

public class Shifr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] sr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                int u = 0, d = 0;
                String[] ar = br.readLine().split(" ");
                for (int j = 0; j < ar[1].length(); j++) {
                    if (ar[1].substring(j, j + 1).equals("U")) {
                        u++;
                    } else {
                        d++;
                    }
                }
                int abs = Math.abs(u - d);
                if (u > d) {
                    if (Integer.parseInt(sr[i])-abs<0){
                        System.out.println(10+Integer.parseInt(sr[i]) - abs);
                    } else {
                        System.out.println(Integer.parseInt(sr[i]) - abs);
                    }
                } else {
                    if (Integer.parseInt(sr[i]) + abs > 9) {
                        System.out.println(Integer.parseInt(sr[i]) + abs - 10);
                    } else {
                        System.out.println(Integer.parseInt(sr[i]) + abs);
                    }
                }
            }
        }
    }
}