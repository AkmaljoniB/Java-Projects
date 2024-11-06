package Codeforces;

import java.util.Scanner;

public class Rows_of_coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]a=new int[n+1],b=new int[n+1];
            for(int i=1;i<=n;i++)a[i]=a[i-1]+sc.nextInt();
            for(int i=1;i<=n;i++)b[i]=b[i-1]+sc.nextInt();
            int max=Integer.MAX_VALUE;
            for(int i=1;i<=n;i++)max=Math.min(max,Math.max(a[n]-a[i],b[i-1]));
            System.out.println(max);
        }
    }
}