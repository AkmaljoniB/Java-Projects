package Codeforces;

import java.util.Scanner;

public class Letter_180C{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0;
        for(int i=0;i<s.length();i++)if(s.charAt(i)-'A'>=0&&s.charAt(i)-'A'<26)l++;
        int p=s.length()-l,k=s.length()-l,min=Math.min(k,l);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'a'>=0&&s.charAt(i)-'a'<26)k--;
            else l--;
            min=Math.min(l+p-k,min);
        }
        System.out.println(min);
    }
}