package Codeforces;

import java.util.Scanner;

public class Mainak_and_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),min=Integer.MAX_VALUE,max=0,res=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                max=Math.max(max,arr[i]);
                min=Math.min(min,arr[i]);
            }
            for(int i=0;i<n-1;i++)res=Math.max(res,arr[i]-arr[i+1]);
            System.out.println(Math.max(Math.max(arr[n-1]-min,max-arr[0]),res));
        }
    }
}
