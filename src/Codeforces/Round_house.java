package Codeforces;

import java.util.Scanner;

public class Round_house {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        System.out.println(b<0?(n+(a+b)%n)%n==0?n:(n+(a+b)%n)%n:(a+b)%n==0?n:(a+b)%n);
    }
}