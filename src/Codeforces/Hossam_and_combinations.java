package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Hossam_and_combinations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for (int i=0;i<n;i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);
            long l1=0,l2=0;
            for (int i=0;i<n; i++) {
                if (arr[i]==arr[0])l1++;
                if (arr[i]==arr[n-1])l2++;
            }
            if (l1==l2 &&l1==n) System.out.println((long) n *((long) n -1));
            else System.out.println(l1*l2*2);
        }
    }
}