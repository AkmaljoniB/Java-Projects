package Codeforces;

import java.util.Scanner;

public class Magnitude_simple_version{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            long l=0,r=0,max=0,s=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>0)l+=arr[i];
                else r+=arr[i];
            }
            for(int i=0;i<n;i++){
                s+=arr[i];
                if(arr[i]>0)l-=arr[i];
                else r-=arr[i];
                max=Math.max(Math.abs(s)+l+r,max);
            }
            System.out.println(max);
        }
    }
}