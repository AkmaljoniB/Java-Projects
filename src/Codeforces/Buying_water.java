package Codeforces;

import java.util.Scanner;

public class Buying_water{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong(),a=sc.nextInt(),b=sc.nextInt();
            System.out.println(Math.min(n/2*b+n%2*a,n*a));
        }
    }
}