package Codeforces;

import java.util.Scanner;

public class Sakurako_and_water {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0;
            int[][]arr=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)arr[i][j]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[i][j]<0){
                        int min=0,u=i,v=j;
                        while(u<n&&v<n){
                            min=Math.min(min,arr[u][v]);
                            arr[u][v]=0;
                            u++;
                            v++;
                        }
                        l+=min;
                    }
                }
            }
            System.out.println(l*-1);
        }
    }
}


//14
//1 1 0 0 3
//0 1 4 4 0
//0 0 3 0 0
//4 5 3 0 -1
//3 1 0 0 5