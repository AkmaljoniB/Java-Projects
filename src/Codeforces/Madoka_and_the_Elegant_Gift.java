package Codeforces;

import java.util.Scanner;

public class Madoka_and_the_Elegant_Gift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            char[][]arr=new char[n][m];
            String s="YES";
            for(int i=0;i<n;i++)arr[i]=sc.next().toCharArray();
            out:for(int i=0;i<n-1;i++){
                for(int j=0;j<m-1;j++){
                    if(arr[i][j]+arr[i+1][j]+arr[i][j+1]+arr[i+1][j+1]-('0'*4)==3){
                        s="NO";
                        break out;
                    }
                }
            }
            System.out.println(s);
        }
    }
}