package Codeforces;

import java.util.Scanner;

public class Professor_Slim{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]<0)l++;
                arr[i]=Math.abs(arr[i]);
            }
            String s="YES";
            for(int i=1;i<l;i++)if(arr[i-1]<arr[i])s="NO";
            for(int i=l+1;i<n;i++)if(arr[i-1]>arr[i])s="NO";
            System.out.println(s);
        }
    }
}