package Codeforces;

import java.io.*;

public class Sostavlenie_komand_programmisti_i_matematiki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int a = Integer.parseInt(ars[0]), b = Integer.parseInt(ars[1]);
            int min = Math.min(Math.min((a+b)/4,a), b);
            System.out.println(min);
        }
        br.close();
    }
}