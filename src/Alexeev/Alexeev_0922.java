package Alexeev;

import java.util.Scanner;

public class Alexeev_0922{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double t1=sc.nextInt(),t2=sc.nextInt(),s1=sc.nextInt(),s2=sc.nextInt(),s=sc.nextInt();
        System.out.println();
        if(s1>s2||s1>=s){
            double p=0,r=s<=s1||(s-s1)%(s1-s2)==0?0:1;
            if(s>s1)r+=(s-s1)/(s1-s2);
            if(s-r*(s1-s2)!=0)p=(s-r*(s1-s2))/(s1/t1);
            System.out.println((t1+t2)*r+p);
        }else System.out.println("NO");
    }
}