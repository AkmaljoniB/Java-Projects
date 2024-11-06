package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Array_stabilization{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[]arr=new Integer[n];
        for (int i=0;i<n; i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(Math.min(arr[n-1]-arr[1],arr[n-2]-arr[0]));
    }
}