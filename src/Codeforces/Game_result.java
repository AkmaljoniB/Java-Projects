package Codeforces;

import java.util.Scanner;

public class Game_result{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0;
        int[][]arr=new int[n][n];
        for(int i=0;i<n;i++)for(int j=0;j<n;j++)arr[i][j]=sc.nextInt();
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<n;j++)s+=arr[i][j];
            for(int p=0;p<n;p++){
                int l=0;
                for(int j=0;j<n;j++)l+=arr[j][p];
                if(l>s)k++;
            }
        }
        System.out.println(k);
    }
}