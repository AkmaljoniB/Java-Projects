package Codeforces;

import java.util.Scanner;

public class Avoid_Trygub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next().replace("t","");
            int l=n-s.length();
            for (int i=0;i<l;i++)s+="t";
            System.out.println(s);
        }
    }
}
