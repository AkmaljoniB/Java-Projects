package Codeforces;

import java.util.Scanner;

public class Also_try_minecraft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        long[]arr=new long[n+2];
        long[]a=new long[n+1];
        long[]b=new long[n+2];
        for (int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
            if (arr[i]>arr[i-1])a[i]=a[i-1];
            else a[i]=arr[i-1]-arr[i]+a[i-1];
        }
        for (int i=n;i>0;i--) {
            if (arr[i]>arr[i+1])b[i]=b[i+1];
            else b[i]=arr[i+1]-arr[i]+b[i+1];
        }
        while (m-->0){
            int s=sc.nextInt(),t=sc.nextInt();
            if (s<t)System.out.println(a[t]-a[s]);
            else System.out.println(b[t]-b[s]);
        }
    }
}