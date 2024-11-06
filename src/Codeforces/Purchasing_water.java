package Codeforces;

import java.util.Scanner;

public class Purchasing_water{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            long n=sc.nextLong(),a=sc.nextInt(),b=sc.nextInt();
            System.out.println(Math.min(n/2*b+n%2*a,n*a));
        }
    }
}