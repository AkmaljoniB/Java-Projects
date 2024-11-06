package Codeforces;

import java.util.*;

public class Wet_Shark_and_elephants{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0,a[][]=new int[1001][1001];
        for(int i=0;i<n;i++)a[sc.nextInt()][sc.nextInt()]++;
        for(int j=1;j<1001;j++){
            int l=0;
            for(int i=1;j+i-1<1001&&i<1001;i++)l+=a[i][j+i-1];
            k+=l*(l-1)/2;
            if(j!=1){
                l=0;
                for(int i=1;j+i-1<1001&&i<1001;i++)l+=a[j+i-1][i];
                k+=l*(l-1)/2;
            }
        }
        for(int j=1;j<1001;j++){
            int l=0;
            for(int i=1;1001-i>0&&i+j-1<1001;i++)l+=a[i+j-1][1001-i];
            k+=l*(l-1)/2;
            if(j!=1){
                l=0;
                for(int i=1;1002-j-i>0&&i<1001;i++)l+=a[1002-j-i][i];
                k+=l*(l-1)/2;
            }
        }
        System.out.println(k);
    }
}
//1 1000 2 999 3 998
//2 1000