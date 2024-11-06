package Codeforces;

import java.util.*;

public class Power_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[]arr=new Integer[n];
        for (int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        long p=(long)Math.pow(arr[n-1],1.0/(n-1)),min=Long.MAX_VALUE;
        for(long j=p;j<=p+1;j++){
            long s=0;
            for (int i=0;i<n;i++)s+=Math.abs(arr[i]-Math.pow(j,i));
            min=Math.min(min,s);
        }
        System.out.println(min);
    }
}