package Alexeev;

import java.util.Scanner;

public class Alexeev_0265{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=0;
        int[][]arr=new int[8][8];
        while(n-->0)arr[sc.nextInt()-1][sc.nextInt()-1]++;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(arr[i][j]==1){
                    if(i==0||arr[i-1][j]==0)l++;
                    if(i==7||arr[i+1][j]==0)l++;
                    if(j==0||arr[i][j-1]==0)l++;
                    if(j==7||arr[i][j+1]==0)l++;
                }
            }
        }
        System.out.println(l);
    }
}