package Codeforces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Minimize_inversions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[][]arr=new int[n][3];
            for (int i=0;i<n;i++) {
                arr[i][0]=sc.nextInt();
                arr[i][1]=arr[i][0];
            }
            for (int i=0;i<n;i++) {
                arr[i][2]=sc.nextInt();
                arr[i][0]+=arr[i][2];
            }
            Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
            for (int i=0;i<n; i++) System.out.print(arr[i][1]+" ");
            System.out.println();
            for (int i=0;i<n; i++) System.out.print(arr[i][2]+" ");
            System.out.println();
        }
    }
}