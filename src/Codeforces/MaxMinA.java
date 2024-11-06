package Codeforces;

import java.util.Scanner;

public class MaxMinA{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            sc.nextLine();
            System.out.println(sc.nextLine().contains("1")?"YES":"NO");
        }
    }
}