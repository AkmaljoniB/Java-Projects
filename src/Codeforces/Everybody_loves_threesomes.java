package Codeforces;

import java.util.Scanner;

public class Everybody_loves_threesomes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==1||n==3)System.out.println(-1);
            else{
                if(n%2==0){
                    for(int i=0;i<n-2;i++) System.out.print(3);
                    System.out.println(66);
                }else{
                    for(int i=0;i<n-4;i++)System.out.print(3);
                    System.out.println(6366);
                }
            }
        }
    }
}