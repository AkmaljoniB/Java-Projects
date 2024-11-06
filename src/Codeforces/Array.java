package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("1 " + arr[0]);
        int i = 1;
        int j = n - 1;
        if (arr[n-1]>0) {
            System.out.println("1 " + arr[n - 1]);
            j--;
        } else {
            System.out.println("2 " + arr[i] + " " + arr[i+1]);
            i+=2;
        }
        System.out.print(j-i+1 +" ");
        for (int p=i;p<=j;p++)System.out.print(arr[p] + " ");
    }
}