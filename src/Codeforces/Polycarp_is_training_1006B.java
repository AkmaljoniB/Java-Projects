package Codeforces;

import java.util.*;

public class Polycarp_is_training_1006B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),s=0;
        int[][]arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=i+1;
        }
        Arrays.sort(arr, Comparator.comparingInt(a->a[0]));
        Arrays.sort(arr,n-k,n,Comparator.comparing(a->a[1]));
        for(int i=n-k;i<n;i++)s+=arr[i][0];
        if(k==1)System.out.println(s+"\n"+n);
        else {System.out.print(s+"\n"+arr[n-k][1]+" ");
        for(int i=n-k+1;i<n-1;i++)System.out.print((arr[i][1]-arr[i-1][1])+" ");
        System.out.print(k!=1?n-arr[n-2][1]:"");
    }}
}