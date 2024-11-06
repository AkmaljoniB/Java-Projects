package Codeforces;

import java.util.Scanner;

public class Sleeping_during_lecture{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt(),s=0,l=0,max=0;
        int[]a=new int[n],t=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            t[i]=sc.nextInt();
            if(t[i]==0)l+=a[i];
            else s+=a[i];
            if(i>=k-1){
                max=Math.max(max,l);
                if(t[i-k+1]==0)l-=a[i-k+1];
            }
        }
        System.out.println(s+max);
    }
}