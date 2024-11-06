package Codeforces;

import java.util.*;

public class Price_equalization{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println(arr[n-1]-arr[0]>k*2?-1:arr[0]+k);
        }
    }
}