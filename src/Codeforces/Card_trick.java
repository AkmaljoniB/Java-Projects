package Codeforces;

import java.util.Scanner;

public class Card_trick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            long m=sc.nextInt(),s=0;
            for(int i=0;i<m;i++)s+=sc.nextInt();
            System.out.println(arr[(int)(s%n)]);
        }
    }
}