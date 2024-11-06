package Codeforces;

import java.util.Scanner;

public class Pokemon_Army_simple_version {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();sc.nextInt();
            int[]arr=new int[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            int max=arr[0];
            long s=0;
            for (int i=1;i<n;i++){
                if (arr[i]>arr[i-1]){
                    s+=max-arr[i-1];
                    max=arr[i];
                }
            }
            System.out.println(s+max);
        }
    }
}
