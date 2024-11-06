package Alexeev;

import java.util.Scanner;

public class Alexeev_0027 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt(),h=sc.nextInt(),n=sc.nextInt(),l=0;
        int[][]arr=new int[w][h];
        while(n-->0){
            int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt();
            for(int i=x1;i<x2;i++){
                for(int j=y1;j<y2;j++){
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                if(arr[i][j]==0)l++;
            }
        }
        System.out.println(l);
    }
}