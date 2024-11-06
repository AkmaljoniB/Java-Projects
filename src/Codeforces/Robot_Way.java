package Codeforces;

import java.util.Scanner;

public class Robot_Way{
    static char[][]arr;
    static int n,m,l=0,o,q;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();m=sc.nextInt();
        arr=new char[n][m];
        for(int i=0;i<n;i++)arr[i]=sc.next().toCharArray();
        for(int i=0;i<n;i++)for(int j=0;j<m;j++)if(arr[i][j]=='S')func(i,j);
    }
    static void func(int i,int j){
        arr[i][j]='S';
        l++;
        if(l==1){o=i;q=j;}
        if(l==3)arr[o][q]='*';
        if(i!=0&&arr[i-1][j]=='*'){
            System.out.print("U");
            func(i-1,j);
        }else if(i!=n-1&&arr[i+1][j]=='*'){
            System.out.print("D");
            func(i+1,j);
        }else if(j!=0&&arr[i][j-1]=='*'){
            System.out.print("L");
            func(i,j-1);
        }else if(j!=m-1&&arr[i][j+1]=='*'){
            System.out.print("R");
            func(i,j+1);
        }
    }
}