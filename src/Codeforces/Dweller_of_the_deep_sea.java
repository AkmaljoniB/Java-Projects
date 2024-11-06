package Codeforces;

import java.util.Scanner;

public class Dweller_of_the_deep_sea{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,r=n-1,p=0;
            long k=sc.nextLong();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            while(k>0&&l<r){
                int min=Math.min(arr[l],arr[r]);
                if(min*2L<=k){
                    arr[r]-=min;
                    p++;
                }else if(min*2L-1<=k&&arr[l]==min){
                    arr[r]-=min-1;
                    p++;
                }
                arr[l]-=min;
                if(arr[l]==0)l++;
                else r--;
                k-=min*2L;
            }
            if(l==r&&arr[r]!=0&&arr[r]<=k)p++;
            if(arr[r]==0)p++;
            System.out.println(p);
        }
    }
}