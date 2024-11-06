package Alexeev;

import java.util.Scanner;

public class Alexeev_0126{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min=Integer.MAX_VALUE,arr[][]=new int[n][n];
        for(int i=0;i<n;i++)for(int j=0;j<n;j++)arr[i][j]=sc.nextInt();
        for(int i=0;i<n;i++)for(int j=0;j<n;j++)if(i!=j)for(int k=0;k<n;k++)if(j!=k&&k!=i)min=Math.min(min,arr[j][k]+arr[k][i]+arr[i][j]);
        System.out.println(min);
    }
}