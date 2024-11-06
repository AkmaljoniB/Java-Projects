package Codeforces;

import java.util.Scanner;

public class Stronge_password {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int l=s.length();
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    if(s.charAt(i)!='a')s=s.substring(0,i)+"a"+s.substring(i);
                    else s=s.substring(0,i)+"b"+s.substring(i);
                    break;
                }
            }
            System.out.println(l==s.length()?s.charAt(0)=='a'?"b"+s:"a"+s:s);
        }
    }
}