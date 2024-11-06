package Codeforces;

import java.util.Scanner;

public class Little_C_loves_3_I {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n-2)%3==0?"1 2 "+(n-3):"1 1 "+(n-2));
    }
}