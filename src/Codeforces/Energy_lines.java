package Codeforces;

import java.util.Scanner;

public class Energy_lines{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long h=0,k=0;
        for(int i=0;i<s.length();i++){
            if(s.startsWith("heavy", i))h++;
            if(s.startsWith("metal", i))k+=h;
        }
        System.out.println(k);
    }
}