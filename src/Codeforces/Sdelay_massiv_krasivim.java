package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Sdelay_massiv_krasivim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr= new PrintWriter(System.out);
        int t= Integer.parseInt(br.readLine());
        while (t-->0){
            String n =br.readLine();
            String[]ars = br.readLine().split(" ");
            int[]arr = new int[ars.length];
            for (int i = 0 ; i  <arr.length;i++){
                arr[i] = Integer.parseInt(ars[i]);
            }
            Arrays.sort(arr);
            if (arr[0]==arr[arr.length-1]){
                pr.println("NO");
            } else {
                pr.println("YES");
                for (int i = 0; i < arr.length / 2; i++) {
                    pr.print(arr[arr.length - 1 - i] + " " + arr[i] + " ");
                }
                if (arr.length%2!=0){
                    pr.print(arr[arr.length/2]);
                }
                pr.println();
            }
        }
        pr.close();
    }
}