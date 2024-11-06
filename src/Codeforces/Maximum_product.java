package Codeforces;

import java.util.*;

public class Maximum_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long[]arr=new long[n];
            for (int i=0;i<n;i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);
            System.out.println(Math.max(arr[n-1]*arr[n-2]*arr[n-3]*arr[n-4]*arr[n-5],Math.max(arr[0]*arr[1]*arr[n-1]*arr[n-2]*arr[n-3],arr[0]*arr[1]*arr[2]*arr[3]*arr[n-1])));
        }
    }
}
