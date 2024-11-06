package Codeforces;

import java.util.Scanner;

public class Jumping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt(),i=1,s=0;
            while (s<x){
                s+=i;
                i++;
            }
            System.out.println(s-x==1?i:i-1);
        }
    }
}