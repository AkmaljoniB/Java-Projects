package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Common_factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0;
        long[]arr=new long[n];
        for (int i=0;i<n;i++)arr[i]=sc.nextLong();
        BigInteger a=BigInteger.valueOf(arr[0]);
        for (int i=1;i<n;i++)a=a.gcd(BigInteger.valueOf(arr[i]));
        int i=1;
        long p= Long.parseLong(a+"");
        for(;(long)i*i<p;i++)if (p%i==0)k+=2;
        System.out.println((long)i*i==p?k+1:k);
    }
}