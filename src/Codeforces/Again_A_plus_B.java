package Codeforces;

import java.util.Scanner;

public class Again_A_plus_B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),n;
        while(t-->0){
            n=sc.nextInt();
            System.out.println(n%10+n/10);
        }
    }
}