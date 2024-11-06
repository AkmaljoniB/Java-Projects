package Codeforces;

import java.util.Scanner;

public class Make_everything_equal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n+1],max=0;
            for(int i=0;i<n;i++)arr[sc.nextInt()]++;
            for(int i=1;i<=n;i++)max=Math.max(max,arr[i]);
            System.out.println(n-max);
        }
    }
}