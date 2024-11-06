package Codeforces;

import java.util.Scanner;

public class GCD_length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t =sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            int x= (int) Math.pow(10,a-1),y= (int) Math.pow(10,b-1),gcd= (int) Math.pow(10,c-1);
            x=x-(x % gcd);
            y=y-(y % gcd)+gcd;
            System.out.println(x+" "+y);
        }
    }
}