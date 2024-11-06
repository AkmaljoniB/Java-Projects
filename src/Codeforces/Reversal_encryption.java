package Codeforces;

import java.util.Scanner;

public class Reversal_encryption{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        for(int i=1;i<=n;i++)if(n%i==0)s=new StringBuilder(s.substring(0,i)).reverse()+s.substring(i);
        System.out.println(s);
    }
}