package Codeforces;

import java.util.Scanner;

public class Data_center{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min=1+n;
        for(int i=2;i*i<=n;i++)if(n%i==0)min=Math.min(i+n/i,min);
        System.out.println(min*2);
    }
}