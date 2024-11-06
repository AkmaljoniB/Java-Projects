package Codeforces;

import java.util.*;
public class Accounting{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt();
        String s="No solution";
        for(int i=-1000;i<=1000;i++)if(Math.pow(i,n)*a==b)s=i+"";
        System.out.print(s);
    }
}