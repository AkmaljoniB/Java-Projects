package Codeforces;

import java.util.Scanner;

public class Protect_the_sheep{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        String s="Yes";
        char[][]arr=new char[n][m];
        for(int i=0;i<n;i++)arr[i]=sc.next().toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]=='S'){
                    if(i!=0&&arr[i-1][j]=='.')arr[i-1][j]='D';
                    else if(i!=0&&arr[i-1][j]=='W'){
                        s="No";
                        break;
                    }
                    if(j!=0&&arr[i][j-1]=='.')arr[i][j-1]='D';
                    else if(j!=0&&arr[i][j-1]=='W'){
                        s="No";
                        break;
                    }
                    if(i!=n-1&&arr[i+1][j]=='.')arr[i+1][j]='D';
                    else if(i!=n-1&&arr[i+1][j]=='W'){
                        s="No";
                        break;
                    }
                    if(j!=m-1&&arr[i][j+1]=='.')arr[i][j+1]='D';
                    else if(j!=m-1&&arr[i][j+1]=='W'){
                        s="No";
                        break;
                    }
                }
            }
        }
        System.out.println(s);
        if(s.length()==3){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++)System.out.print(arr[i][j]);
                System.out.println();
            }
        }
    }
}
