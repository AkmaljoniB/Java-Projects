package Codeforces;

import java.util.Scanner;

public class Matrix_stabilization{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),arr[][]=new int[n][m];
            for(int i=0;i<n;i++)for(int j=0;j<m;j++)arr[i][j]=sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if((i==0||arr[i][j]>arr[i-1][j])&&(i==n-1||arr[i][j]>arr[i+1][j])&&(j==0||arr[i][j]>arr[i][j-1])&&(j==m-1||arr[i][j]>arr[i][j+1])){
                        int max=0;
                        if(i!=0)max=arr[i-1][j];
                        if(i!=n-1)max=Math.max(arr[i+1][j],max);
                        if(j!=0)max=Math.max(arr[i][j-1],max);
                        if(j!=m-1)max=Math.max(arr[i][j+1],max);
                        arr[i][j]=max;
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++)System.out.print(arr[i][j]+" ");
                System.out.println();
            }
        }
    }
}