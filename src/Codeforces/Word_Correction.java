package Codeforces;

import java.util.Scanner;

public class Word_Correction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String a = "aeiouy";
        for (int i=0;i<s.length()-1;i++){
            if (a.contains(s.charAt(i)+"") && a.contains(s.charAt(i+1)+"")){
                s=s.substring(0,i+1)+s.substring(i+2);
                i--;
            }
        }
        System.out.println(s);
    }
}