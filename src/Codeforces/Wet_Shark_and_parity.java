package Codeforces;

import java.util.Scanner;

public class Wet_Shark_and_parity{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min=Integer.MAX_VALUE;
        long s=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a%2!=0)min=Math.min(min,a);
            s+=a;
        }
        System.out.println(s%2==0?s:min!=Integer.MAX_VALUE?s-min:0);
    }
}