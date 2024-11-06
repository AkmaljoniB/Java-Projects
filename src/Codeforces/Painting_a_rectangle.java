package Codeforces;

import java.util.Scanner;

public class Painting_a_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            String p="NO",arr[]=new String[n];
            for(int i=0;i<n;i++)arr[i]=sc.next();
            if(arr[0].charAt(0)==arr[n-1].charAt(m-1)||arr[0].charAt(m-1)==arr[n-1].charAt(0))p="YES";
            else{
                if(arr[0].contains(arr[n-1].charAt(m-1)+""))p=f1(arr,0,n,m-1,0,n-1);
                if(p.length()==2&&arr[n-1].contains(arr[0].charAt(0)+""))p=f2(arr,-1,n-1,0,m-1,0);
                if(p.length()==2&&arr[0].contains(arr[n-1].charAt(0)+""))p=f2(arr,0,n,0,m-1,n-1);
                if(p.length()==2&&arr[n-1].contains(arr[0].charAt(m-1)+""))p=f1(arr,-1,n-1,m-1,0,0);
            }
            System.out.println(p);
        }
    }
    static String f1(String[]arr,int i,int j,int l,int r,int f){
        while(++i<j)if(arr[i].indexOf(arr[f].charAt(l)+"")==r)return "YES";
        return "NO";
    }
    static String f2(String[]arr,int i,int j,int l,int r,int f){
        while(++i<j)if(arr[i].lastIndexOf(arr[f].charAt(l)+"")==r)return "YES";
        return "NO";
    }
}