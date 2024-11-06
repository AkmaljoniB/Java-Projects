package Codeforces;

import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long s=1,p=0,l=0;
        for (int i=0;i<n;i++) {
            int a=sc.nextInt();
            if (a==1){
                if (l==1)s=s*(1+p);
                l=1;
                p=0;
            }else p++;
        }
        System.out.println(p==n?0:s);
    }
}