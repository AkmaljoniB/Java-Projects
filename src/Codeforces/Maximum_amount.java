package Codeforces;

import java.util.*;

public class Maximum_amount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),arr[]=new int[n+1];
            long a[]=new long[n+1],b[]=new long[n+1];
            for(int i=1;i<=n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=1;i<=n;i++)a[i]=arr[i]+a[i-1];
            for(int i=n;i>0;i--)b[n-i+1]=arr[i]+b[n-i];
            long max=Math.max(b[n]-b[k],a[n]-a[k*2]);
            for(int i=1;i<=k;i++)max=Math.max(max,a[n]-a[i*2]-b[k-i]);
            System.out.println(max);
        }
    }
}