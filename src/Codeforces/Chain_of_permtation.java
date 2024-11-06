package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Chain_of_permtation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            pr.println(n);
            Integer[]arr=new Integer[n+1];
            for (int i=1;i<=n;i++)arr[i]=i;
            for (int i=0;i<n;i++){
                for (int j=1;j<=n;j++) pr.print(arr[j]+" ");
                pr.println();
                arr[n-i]=arr[n-i-1];
                arr[n-i-1]=n;
            }
        }
        pr.close();
    }
}