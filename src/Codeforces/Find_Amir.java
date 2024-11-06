package Codeforces;

import java.util.Scanner;
public class Find_Amir {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Math.max(n/2-1+n%2,0));
    }
}