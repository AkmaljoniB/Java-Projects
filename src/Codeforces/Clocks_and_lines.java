package Codeforces;

import java.util.Scanner;

public class Clocks_and_lines{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
            int l=Math.min(a,b);
            b=Math.max(a,b);
            a=l;
            System.out.println((a<=c&&c<=b&&(d<a||d>b))||(a<=d&&d<=b&&(c<a||c>b))?"YES":"NO");
        }
    }
}