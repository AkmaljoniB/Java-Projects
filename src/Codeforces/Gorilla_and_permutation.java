package Codeforces;

import java.util.Scanner;

public class Gorilla_and_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
            for(int i=n;i>m;i--)System.out.print(i+" ");
            for(int i=1;i<=m;i++)System.out.print(i+" ");
            System.out.println();
        }
    }
}