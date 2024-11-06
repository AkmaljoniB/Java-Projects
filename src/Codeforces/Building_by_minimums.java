package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Building_by_minimums {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n*(n-1)/2];
            for (int i =0;i<arr.length;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int l=n-2,p=n-2;
            for (int i=0;i<n;i++){
                System.out.print(arr[l]+" ");
                l+=p;
                p--;
            }
            System.out.println();
        }
    }
}