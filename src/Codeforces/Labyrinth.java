package Codeforces;

import java.util.Scanner;

public class Labyrinth {
    static int n,m;
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int k=sc.nextInt();
        char[][]arr=new char[n][m];
        for(int i=0;i<n;i++)arr[i]=sc.next().toCharArray();
        out:for(int i=0;i<n;i++) {
            for (int j=0;j<m;j++){
                if(arr[i][j]=='.'){

                    if(k==0)break out;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}