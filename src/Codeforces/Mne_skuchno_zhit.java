package Codeforces;

import java.io.*;

public class Mne_skuchno_zhit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ars = br.readLine().split(" ");
        int a = Integer.parseInt(ars[0]);
        int b = Integer.parseInt(ars[1]);
        int min = Math.min(a, b);
        int s = 1;
        for (int i = 2; i <=min; i++) {
            s *= i;
        }
        System.out.println(s);
    }
}