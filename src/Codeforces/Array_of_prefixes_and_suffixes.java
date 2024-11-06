package Codeforces;

import java.util.Scanner;

public class Array_of_prefixes_and_suffixes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String a="",b="";
            for(int i=0;i<2*n-2;i++){
                String s=sc.next();
                if(s.length()==n-1){
                    if(a.length()==0)a=s;
                    else b=s;
                }
            }
            if(b.substring(0,n-2).equals(a.substring(1)))a=a+b.substring(n-2);
            else a=b.charAt(0)+a;
            StringBuilder sb=new StringBuilder(a).reverse();
            System.out.println(a.contentEquals(sb)?"YES":"NO");
        }
    }
}