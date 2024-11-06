package Codeforces;

import java.util.*;

public class Lakes{
    static int n,m,s,arr[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int mx=0;
            n=sc.nextInt();
            m=sc.nextInt();
            arr=new int[n][m];
            for(int i=0;i<n;i++)for(int j=0;j<m;j++)arr[i][j]=sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(arr[i][j]!=0){
                        s=arr[i][j];
                        arr[i][j]=0;
                        func(i,j);
                        mx=Math.max(mx,s);
                        s=0;
                    }
                }
            }
            System.out.println(mx);
        }
    }
    static void func(int i,int j){
        if(i!=0&&arr[i-1][j]!=0){
            s+=arr[i-1][j];
            arr[i-1][j]=0;
            func(i-1,j);
        }
        if(i!=n-1&&arr[i+1][j]!=0){
            s+=arr[i+1][j];
            arr[i+1][j]=0;
            func(i+1,j);
        }
        if(j!=0&&arr[i][j-1]!=0) {
            s+=arr[i][j-1];
            arr[i][j-1]=0;
            func(i,j-1);
        }
        if(j!=m-1&&arr[i][j+1]!=0){
            s+=arr[i][j+1];
            arr[i][j+1]=0;
            func(i,j+1);
        }
    }
}