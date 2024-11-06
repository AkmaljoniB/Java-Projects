package Codeforces;

import java.util.*;

public class Casino_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            int[][]arr=new int[m][n];
            long s=0;
            for(int i=0;i<n;i++)for(int j=0;j<m;j++)arr[j][i]=sc.nextInt();
            for(int i=0;i<m;i++){
                Arrays.sort(arr[i]);
                long a=0;
                for(int j=1;j<n;j++){
                    a+=(long)j *(arr[i][j]-arr[i][j-1]);
                    s+=a;
                }
            }
            System.out.println(s);
        }
    }
}
//1 2 1
//5 2 1
//10 2 3
//18 2 7
//
//2 +0+2 =4
//0 +0+2 =2
//3 +0+4 =7
//2 +0+0 =2
//1 +0+6 =7
//3 +0+6 =9
//11+0+20=31
