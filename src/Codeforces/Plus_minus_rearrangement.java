package Codeforces;

import java.util.*;

public class Plus_minus_rearrangement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),lcm=x/gcd(x,y)*y,p=n/x-n/lcm,q=n/y-n/lcm;
            System.out.println(((n-p+1+n)*(n-(n-p+1)+1)/2)-((1+q)*q/2));
        }
    }
    public static long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
}