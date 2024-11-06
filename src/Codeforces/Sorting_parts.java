package Codeforces;

import java.util.Scanner;

public class Sorting_parts{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;){
            int n=sc.nextInt();
            String s="NO";
            int a=sc.nextInt(),b;
            for(int i=1;i<n;i++){
                b=sc.nextInt();
                if (a>b)s="YES";
                a=b;
            }
            System.out.println(s);
        }
    }
}
