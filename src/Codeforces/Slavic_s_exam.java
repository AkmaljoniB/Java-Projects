package Codeforces;

import java.util.Scanner;

public class Slavic_s_exam{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next(),b=sc.next();
            int j=0;
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<a.length();i++){
                if(j<b.length()&&(a.charAt(i)=='?'||a.charAt(i)==b.charAt(j))){
                    sb.append(b.charAt(j));
                    j++;
                }else if(a.charAt(i)=='?')sb.append("a");
                else sb.append(a.charAt(i));
            }
            System.out.println(j==b.length()?"YES\n"+sb:"NO");
        }
    }
}