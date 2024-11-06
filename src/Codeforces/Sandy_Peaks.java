package Codeforces;

import java.util.Scanner;

public class Sandy_Peaks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0;
            int[]arr=new int[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            for (int i=1;i<n-1;i++)if (arr[i]>arr[i-1]+arr[i+1])l++;
            System.out.println(k==1?(n-1)/2:l);
        }
    }
}