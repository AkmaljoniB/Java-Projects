package Codeforces;

import java.util.Scanner;

public class TRUE_battle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(s.endsWith("1")||s.startsWith("1")||s.contains("11")?"Yes":"No");
        }
    }
}