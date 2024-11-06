package Codeforces;

import java.util.Scanner;

public class Vasya_and_isolated_peaks {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt(),m=sc.nextLong(),l=0,q=Math.max(n-m*2,0);
        while(m>0){
            m-=l;
            l++;
        }
        System.out.print(q+" "+(n-l));
    }
}