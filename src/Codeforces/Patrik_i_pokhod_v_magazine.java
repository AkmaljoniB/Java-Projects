package Codeforces;

import java.io.*;

public class Patrik_i_pokhod_v_magazine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ars = br.readLine().split(" ");
        int d1 = Integer.parseInt(ars[0]);
        int d2 = Integer.parseInt(ars[1]);
        int d3 = Integer.parseInt(ars[2]);
        int s1 = d1*2+d2*2;
        int s2 = d3*2+d1*2;
        int s3 = d3*2+d2*2;
        int s4 = d3+d2+d1;
        int min = Math.min(Math.min(s1,s4),Math.min(s2,s3));
        System.out.println(min);
    }
}