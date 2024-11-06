package Codeforces;

import java.util.Scanner;

public class Scheme {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),p=0;
            for(int i=0;i<n*2;i++)p+=sc.nextInt();
            if(p<=n)System.out.println((p%2)+" "+p);
            else System.out.println(((n*2-p)%2)+" "+(n*2-p));
        }
    }
}