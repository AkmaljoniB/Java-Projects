package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class We_divide_objects{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),s=0;
            Integer[]arr=new Integer[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=n-2;i>=0;i-=2){
                s+=Math.max(arr[i+1]-arr[i]-k,0);
                k=Math.max(k-arr[i+1]+arr[i],0);
            }
            System.out.println(n%2!=0?s+arr[0]:s);
        }
    }
}