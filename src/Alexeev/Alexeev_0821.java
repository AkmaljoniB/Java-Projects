package Alexeev;

import java.util.Scanner;

public class Alexeev_0821{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=n-1,r=n-1;
        sc.nextLine();
        if(n==1){
            if(!sc.hasNext())System.out.println(0);
            else System.out.println("ERROR 1");
            return;
        }
        String s=sc.nextLine(),p="";
        int[][]arr=new int[n][n];
        for(int i=0;i<n;i++)for(int j=0;j<n;j++)arr[i][j]=i*n+j+1;
        arr[l][r]=0;
        for(int i=0;i<s.length();i++){
            int l1=l,r1=r;
            if(s.charAt(i)=='U')l1--;
            if(s.charAt(i)=='D')l1++;
            if(s.charAt(i)=='L')r1--;
            if(s.charAt(i)=='R')r1++;
            if(l1>=0&&l1<n&&r1>=0&&r1<n){
                arr[l][r]=arr[l1][r1];
                arr[l1][r1]=0;
                l=l1;
                r=r1;
            }else{
                p="ERROR "+(i+1);
                break;
            }
        }
        if(p.contains("ERROR")){
            System.out.println(p);
            return;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}