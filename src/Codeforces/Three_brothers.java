package Codeforces;

import java.util.Scanner;

public class Three_brothers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=3;
        if(a!=1&&b!=1)c=1;
        else if(a!=2&&b!=2)c=2;
        System.out.println(c);
    }
}