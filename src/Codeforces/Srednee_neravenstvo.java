package Codeforces;

import java.io.*;
import java.util.Arrays;

public class Srednee_neravenstvo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String n = br.readLine();
            String[] ars = br.readLine().split(" ");
            int[] arr = new int[ars.length];
            for (int i = 0; i < ars.length; i++) {
                arr[i] = Integer.parseInt(ars[i]);
            }
            Arrays.sort(arr);
            int k = 0, l = 0;
            for (int i = 0; i < ars.length - l; i++) {
                k++;
                if (k != 2) {
                    pr.print(arr[i]+" ");
                } else {
                    k = 0;
                    pr.print(arr[arr.length - 1 - l]+" ");
                    l++;
                    i--;
                }
            }
            pr.println();
        }
        pr.close();
    }
}