package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Book_exchange_hard_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n+1];
            for (int i=1;i<=n;i++) arr[i]=sc.nextInt();
            for (int i=1;i<=n;i++) {
                int l =arr[i],k=1;
                while (l!=i){
                    l=arr[l];
                    k++;
                }
                pr.print(k+" ");
            }
            pr.println();
        }
        pr.close();
    }
}
