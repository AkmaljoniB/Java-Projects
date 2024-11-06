package Codeforces;

import java.util.Scanner;

public class Captain_Flint_and_long_voyages {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int t=sc.nextInt();t-->0;){
            int n=sc.nextInt();
            int x =(n-1)-(n-1)/4,i;
            for(i=0;i<x;i++)System.out.print("9");
            for(i=0;i<n-x;i++)System.out.print("8");
            System.out.println();
        }
    }
}