package Codeforces;

import java.util.Scanner;

public class Minimize_subarrays_with_the_same_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=1;i<n;i++)System.out.print(arr[i]+" ");
            System.out.println(arr[0]);
        }
    }
}