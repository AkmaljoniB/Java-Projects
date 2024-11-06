package Codeforces;

import java.util.Scanner;

public class Alice_and_books{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),max=0;
            for(int i=1;i<n;i++)max=Math.max(max,sc.nextInt());
            System.out.println(max+sc.nextInt());
        }
    }
}