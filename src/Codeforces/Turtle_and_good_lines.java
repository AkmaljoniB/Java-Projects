package Codeforces;

import java.util.Scanner;

public class Turtle_and_good_lines{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(s.charAt(0)==s.charAt(n-1)?"NO":"YES");
        }
    }
}