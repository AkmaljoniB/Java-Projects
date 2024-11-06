package Codeforces;

import java.util.Scanner;

public class tree_palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder p=new StringBuilder();
        for(int i=4;i<=n;i+=4)p.append("aabb");
        System.out.println(p+"aabb".substring(0,n%4));
    }
}