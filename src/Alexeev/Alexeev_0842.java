package Alexeev;

import java.util.Scanner;

public class Alexeev_0842{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        while(n%2==0)n/=2;
        while(n%5==0)n/=5;
        System.out.println(n>1?"YES":"NO");
    }
}