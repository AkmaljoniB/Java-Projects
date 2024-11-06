package Codeforces;

import java.util.Scanner;

public class NOC_task{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        if(n==1)System.out.println(1);
        else if(n==2)System.out.println(2);
        else if(n==6)System.out.println(60);
        else System.out.println(Math.max(n*(n-1)*(n-2)/gcd(n,n-1)/gcd(n-1,n-2)/gcd(n,n-2),Math.max((n-1)*(n-2)*(n-3)/gcd(n-1,n-2)/gcd(n-2,n-3)/gcd(n-1,n-3),n*(n-1)*(n-3)/gcd(n,n-1)/gcd(n-1,n-3)/gcd(n,n-3))));
    }
    public static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}