package Codeforces;

import java.util.*;

public class Q123_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[4];
        for (int i=0;i<n;i++) arr[sc.nextInt()]++;
        Arrays.sort(arr);
        System.out.println(n-arr[3]);
    }
}