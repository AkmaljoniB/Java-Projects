package Codeforces;

import java.io.*;

public class Polikarp_i_summi_podposledovatelnostey {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            String[]sr = br.readLine().split(" ");
            int a1 = Integer.parseInt(sr[0]);
            int a2 = Integer.parseInt(sr[1]);
            int a3 = Integer.parseInt(sr[2]);
            int a4 = Integer.parseInt(sr[3]);
            int a5 = Integer.parseInt(sr[4]);
            int a6 = Integer.parseInt(sr[5]);
            int s = Integer.parseInt(sr[6]);
            if (a1+a2+a3==s){
                System.out.print(a1+" ");
                System.out.print(a2+" ");
                System.out.println(a3);
            } else {
                System.out.print(a1+" ");
                System.out.print(a2+" ");
                System.out.println(a4);
            }
        }
    }
}