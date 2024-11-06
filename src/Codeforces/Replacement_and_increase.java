package Codeforces;

import java.util.Scanner;

public class Replacement_and_increase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),q=sc.nextInt(),k=sc.nextInt();
        int[]arr=new int[n+2],nums=new int[n+1];
        for (int i=1;i<=n;i++)arr[i]=sc.nextInt();
        nums[1]=arr[1]+arr[2]-arr[1]-2;
        for (int i=2;i<n;i++) nums[i]=nums[i-1]+arr[i+1]-arr[i]+arr[i]-arr[i-1]-2;
        nums[n]=nums[n-1]+k-arr[n]+arr[n]-arr[n-1]-1;
        while (q-->0){
            int l=sc.nextInt(),r=sc.nextInt();
            if (r==n) System.out.println(nums[r]-nums[l-1]+(arr[l]-(arr[l]-arr[l-1])));
            else System.out.println(nums[r]-nums[l-1]+(k-arr[r]-arr[r+1]+arr[r]+1)+(arr[l]-(arr[l]-arr[l-1])));
        }
    }
}