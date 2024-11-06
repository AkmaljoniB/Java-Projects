package Codeforces;

import java.util.Scanner;

public class Best_permutation_1728B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%2!=0)System.out.print("1 ");
            for(int i=n-2;i>=1+n%2;i--)System.out.print(i+" ");
            System.out.print(n-1+" "+n+"\n");
        }
    }
}