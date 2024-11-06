package Codeforces;

import java.util.Scanner;

public class Hunger_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt(),j=0;
            long s=0;
            int[]arr=new int[n],num=new int[n+1],dp=new int[n+2];
            long sum=0;
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                while(j<n&&sum+arr[j]<=x)sum+=arr[j++];
                num[i]=j;
                sum-=arr[i];
            }
            for(int i=n-1;i>=0;i--){
                dp[i]=dp[num[i]+1]+num[i]-i;
                s+=dp[i];
            }
            System.out.println(s);
        }
    }
}