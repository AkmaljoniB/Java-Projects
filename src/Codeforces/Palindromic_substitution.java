package Codeforces;

import java.util.Scanner;

public class Palindromic_substitution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next(),p="YES";
            for (int i=0;i<n/2;i++)if (Math.abs(s.charAt(i)-s.charAt(n-1-i))!=2&&Math.abs(s.charAt(i)-s.charAt(n-1-i))!=0)p="NO";
            System.out.println(p);
        }
    }
}
