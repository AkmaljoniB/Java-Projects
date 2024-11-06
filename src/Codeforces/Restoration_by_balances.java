package Codeforces;

import java.util.Scanner;

public class Restoration_by_balances{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),a=1000;
            System.out.print(a+" ");
            for(int i=1;i<n;i++){
                a+=sc.nextInt();
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}