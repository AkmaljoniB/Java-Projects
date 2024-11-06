package Codeforces;

import java.util.Scanner;

public class Basil_s_Garden {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            long max=arr[0];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                max=Math.max(arr[i]+i,max);
            }
            System.out.println(max);
        }
    }
}