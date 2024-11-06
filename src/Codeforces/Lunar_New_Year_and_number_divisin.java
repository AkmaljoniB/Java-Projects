package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Lunar_New_Year_and_number_divisin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[]arr=new Integer[n];
        for (int i=0;i<n;i++)arr[i]=sc.nextInt();
        Arrays.sort(arr);
        long s=0;
        for(int i=0;i<n/2;i++)s+=Math.pow(arr[i]+arr[n-1-i],2);
        System.out.println(s);
    }
}