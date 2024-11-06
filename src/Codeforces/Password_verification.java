package Codeforces;

import java.util.Scanner;

public class Password_verification{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0,p=0,k=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'a'>=0&&s.charAt(i)-'a'<26)l++;
            if(s.charAt(i)-'A'>=0&&s.charAt(i)-'A'<26)p++;
            if(s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<10)k++;
        }
        System.out.println(s.length()>4&&Math.min(Math.min(l,p),k)!=0?"Correct":"Too weak");
    }
}