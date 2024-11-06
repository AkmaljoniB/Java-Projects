package Codeforces;

import java.util.*;

public class Chamo_and_Mochi_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),mx=0,a[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n;i++)if(mx<a[i]&&((i!=0&&a[i-1]>=a[i])||(i!=n-1&&a[i]<=a[i+1])||(i>1&&a[i-2]>=a[i])||(i<n-2&&a[i+2]>=a[i])))mx=a[i];
            System.out.println(mx);
        }
    }
}