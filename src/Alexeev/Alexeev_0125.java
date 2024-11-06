package Alexeev;

import java.util.Scanner;

public class Alexeev_0125{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),num[]=new int[n],k=0;
        int[][]arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)num[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1&&num[i]!=num[j])k++;
            }
        }
        System.out.println(k/2);
    }
}