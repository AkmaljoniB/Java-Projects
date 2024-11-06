package Codeforces;

import java.util.Scanner;

public class Fun_with_Even_Subarrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,k=1,arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=n-2;i>=0;i--){
                if(arr[i]==arr[n-1])k++;
                else{
                    l++;
                    i=i-k+1;
                    k*=2;
                }
            }
            System.out.println(l);
        }
    }
}