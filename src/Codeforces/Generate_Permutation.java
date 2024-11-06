package Codeforces;

import java.util.Scanner;

public class Generate_Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%2==1){
                System.out.print(n+" ");
                for(int i=n/2;i>0;i--)System.out.print(i+" ");
                for(int i=n/2+1;i<n;i++)System.out.print(i+" ");
                System.out.println();
            }else System.out.println(-1);
        }
    }
}