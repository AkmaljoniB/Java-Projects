package Codeforces;

import java.util.Scanner;

public class Fedya_and_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt(),y=sc.nextInt();
            System.out.println((x-y)*2);
            for(int i=y;i<=x;i++)System.out.print(i+" ");
            for(int i=x-1;i>y;i--)System.out.print(i+" ");
            System.out.println();
        }
    }
}