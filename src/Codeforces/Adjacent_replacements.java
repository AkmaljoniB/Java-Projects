package Codeforces;

import java.util.Scanner;

public class Adjacent_replacements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a;
        for (int i=0;i<n;i++){
            a=sc.nextInt();
            System.out.println(a-1+a%2);
        }
    }
}