package Codeforces;

import java.util.Scanner;

public class National_project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextInt(),g=sc.nextInt(),b=sc.nextInt(),p=(n+1)/2,k=p%g==0?0:1;
            System.out.println(n<=g?n:Math.max(p+(p/g+k-1)*b,n));
        }
    }
}