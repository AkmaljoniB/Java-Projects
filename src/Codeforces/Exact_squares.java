package Codeforces;

import java.util.Scanner;

public class Exact_squares{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        for(int n=sc.nextInt();n-->0;){
            int a=sc.nextInt();
            if (Math.sqrt(a)!=(int)Math.sqrt(a))max=Math.max(a,max);
        }
        System.out.println(max);
    }
}