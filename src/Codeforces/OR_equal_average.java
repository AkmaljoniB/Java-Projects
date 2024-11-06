package Codeforces;

import java.util.Scanner;

public class OR_equal_average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%2==0){
                System.out.print("1 3 ");
                n-=2;
            }
            for(int i=0;i<n;i++) System.out.print("2 ");
            System.out.println();
        }
    }
}