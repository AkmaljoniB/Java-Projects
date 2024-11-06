package Codeforces;

import java.util.Scanner;

public class Farmer_John_is_Challenge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            if(n==k)for(int i=0;i<n;i++) System.out.print("1 ");
            else if(k==1){
                System.out.print("1 ");
                for(int i=1;i<n;i++) System.out.print("2 ");
            }else System.out.print("-1");
            System.out.println();
        }
    }
}