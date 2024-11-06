package Codeforces;

import java.util.Scanner;

public class Load_more_memory {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            System.out.println((n-1)*k+1);
        }
    }
}