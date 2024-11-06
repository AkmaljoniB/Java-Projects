package Codeforces;

import java.util.Scanner;

public class Simple_palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s="aeiou",r="";
            for(int i=0;i<5;i++){
                int l=n%5>i?1:0;
                for(int j=0;j<n/5+l;j++)r+=s.charAt(i);
            }
            System.out.println(r);
        }
    }
}