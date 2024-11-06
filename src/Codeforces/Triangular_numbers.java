package Codeforces;

import java.util.Scanner;

public class Triangular_numbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=1;
        while(n>0){
            n-=l;
            l++;
        }
        System.out.println(n==0?"YES":"NO");
    }
}