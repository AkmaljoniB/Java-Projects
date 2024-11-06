package Codeforces;

import java.util.Scanner;

public class Symmetrical_lattice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),s=0;
            char[][]arr=new char[n][n];
            for(int i=0;i<n;i++)arr[i]=sc.next().toCharArray();
            for(int i=0;i<n/2;i++){
                for(int j=0;j<(n+1)/2;j++){
                    int l=arr[i][j]+arr[n-1-i][n-1-j]+arr[j][n-1-i]+arr[n-1-j][i]-('0'*4);
                    s+=Math.min(l,4-l);
                }
            }
            System.out.println(s);
        }
    }
}