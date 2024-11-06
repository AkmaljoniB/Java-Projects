package Codeforces;

import java.util.Scanner;

public class Enlarge_Reduce_Copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n],num[]=new int[n+1];
            long l=0;
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<=n;i++)num[i]=sc.nextInt();
            int min=Math.abs(num[n]-arr[0]);
            for(int i=0;i<n;i++){
                l+=Math.abs(arr[i]-num[i]);
                if(arr[i]>=num[n]&&num[n]>=num[i]||arr[i]<=num[n]&&num[n]<=num[i])min=0;
                else min=Math.min(Math.min(Math.abs(arr[i]-num[n]),Math.abs(num[n]-num[i])),min);
            }
            System.out.println(l+min+1);
        }
    }
}