package Codeforces;

import java.util.Scanner;

public class Closing_the_gap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),s=0;
            for (int i=0;i<n;i++)s+=sc.nextInt();
            System.out.println(s%n==0?0:1);
        }
    }
}