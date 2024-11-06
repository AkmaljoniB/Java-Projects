package Codeforces;

import java.util.Scanner;

public class Minimize_singularity {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            StringBuilder sb=new StringBuilder();
            sb.append("0".repeat(n-1));
            System.out.println(sb.append("1"));
        }
    }
}