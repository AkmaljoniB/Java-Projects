package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class We_get_a_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n+1];
        arr[0]=Integer.MIN_VALUE;
        for (int i=1;i<=n; i++) arr[i]=sc.nextInt();
        Arrays.sort(arr);
        long l=0;
        for (int i=0;i<n;i++)l+=Math.abs(arr[i]-i);
        System.out.println(l);
    }
}
