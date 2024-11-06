package Codeforces;

import java.util.Scanner;

public class George_and_round{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),a[]=new int[n],j=0;
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<m;i++){
            int b=sc.nextInt();
            if(j<n&&a[j]<=b)j++;
        }
        System.out.println(n-j);
    }
}