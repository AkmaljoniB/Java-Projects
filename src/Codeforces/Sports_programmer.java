package Codeforces;

import java.util.Scanner;

public class Sports_programmer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int k=0;
            String s=sc.next();
            for (int i=0;i<s.length();i++)k+=Integer.parseInt(s.substring(i,i+1));
            System.out.println(k%3==0 &&s.contains("0")&&(s.contains("2")||s.contains("4")||s.contains("6")||s.contains("8")||s.length()-s.replace("0","").length()>1)?"red":"cyan");
        }
    }
}