package Codeforces;

import java.util.Scanner;

public class Lever_arm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long a=0,b=0,l=s.indexOf("^");
        for(int i=0;i<l;i++)if(s.charAt(i)!='=')a+=(l-i)*(s.charAt(i)-'0');
        for(int i=(int)l+1;i<s.length();i++)if(s.charAt(i)!='=')b+=(i-l)*(s.charAt(i)-'0');
        System.out.println(a<b?"right":a>b?"left":"balance");
    }
}