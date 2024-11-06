package Codeforces;

import java.util.Scanner;

public class Career_rearrangement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0,r=n,i=1;
            int[]arr=new int[n];
            for(;k*l<n;l++)arr[k*l]=l+1;
            while(l<r){
                if(i%2!=0){
                    for(int p=i;p<n;p+=k){
                        arr[p]=r;
                        r--;
                    }
                }else{
                    for(int p=n-(n-i-1)%k-1;p>=i;p-=k){
                        arr[p]=r;
                        r--;
                    }
                }
                i++;
            }
            for(int p=0;p<n;p++)System.out.print(arr[p]+" ");
            System.out.println();
        }
    }
}