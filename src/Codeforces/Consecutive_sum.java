package Codeforces;

import java.util.Scanner;

public class Consecutive_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt();long s=0;
            Integer[]arr=new Integer[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            for (int i=0;i<k;i++){
                int max=arr[i];
                for (int j=i;j<n;j+=k)max=Math.max(max,arr[j]);
                s+=max;
            }
            System.out.println(s);
        }
    }
}