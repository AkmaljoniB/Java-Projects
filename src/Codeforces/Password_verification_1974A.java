package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Password_verification_1974A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next(),p="";
            String[]ars=new String[n];
            for(int i=0;i<s.length();i++)ars[i]=s.charAt(i)+"";
            Arrays.sort(ars);
            for(int i=0;i<n;i++)p=p+ars[i];
            System.out.println(p.equals(s)?"YES":"NO");
        }
    }
}