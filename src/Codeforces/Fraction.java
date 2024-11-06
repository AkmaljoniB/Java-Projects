package Codeforces;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if ((n/2)%2==0||n%2!=0)System.out.println(n%2==0?(n/2-1)+" "+(n/2+1):(n/2)+" "+(n/2+1));
        else System.out.println((n/2-2)+" "+(n/2+2));

    }
}