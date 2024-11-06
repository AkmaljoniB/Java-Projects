package Codeforces;

import java.util.Scanner;

public class Luntik_and_subsequences{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,p=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a==0)l++;
                else if(a==1)p++;
            }
            System.out.println((long)p*(1L<<l));
        }
    }
}