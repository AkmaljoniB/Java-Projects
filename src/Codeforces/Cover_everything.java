package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Cover_everything {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            String p="abcdefghijklmnopqrstuvwxyz";
            for (int i=0;i<n;i++) {
                for (int j=0;j<k; j++) {
                    pr.print(p.charAt(j));
                }
            }
            pr.println();
        }
        pr.close();
    }
}