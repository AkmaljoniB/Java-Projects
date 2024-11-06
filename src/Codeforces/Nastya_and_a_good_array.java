package Codeforces;

import java.util.Scanner;

public class Nastya_and_a_good_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),min=Integer.MAX_VALUE,k=0;
            int[]arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if (min>arr[i]){
                    min=arr[i];
                    k=i;
                }
            }
            System.out.println(n-1);
            for (int i=k-1;i>=0;i--)System.out.println((k+1)+" "+(i+1)+" "+min+" "+(min+k-i));
            for (int i=k+1;i<n;i++) System.out.println((k+1)+" "+(i+1)+" "+min+" "+(min+i-k));
        }
    }
}