package Codeforces;

import java.util.Scanner;

public class Robot_vacuum_cleaner{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),rb=sc.nextInt(),cb=sc.nextInt(),rd=sc.nextInt(),cd=sc.nextInt(),min=Integer.MAX_VALUE;
            if(rb>rd)min=Math.min(n-rb+n-rd,min);
            else min=Math.min(rd-rb,min);
            if(cb>cd)min=Math.min(m-cb+m-cd,min);
            else min=Math.min(cd-cb,min);
            System.out.println(min);
        }
    }
}