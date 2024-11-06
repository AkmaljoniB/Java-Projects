package Codeforces;

import java.util.Scanner;

public class George_and_the_dream{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int m1=Integer.parseInt(s.substring(0,2))*60+Integer.parseInt(s.substring(3))-Integer.parseInt(t.substring(0,2))*60-Integer.parseInt(t.substring(3));
        if(m1<0)m1+=1440;
        if(m1/60<10)System.out.print("0");
        System.out.print(m1/60+":");
        if(m1%60<10) System.out.print("0");
        System.out.print(m1%60);
    }
}