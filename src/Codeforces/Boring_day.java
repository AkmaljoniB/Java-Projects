package Codeforces;

import java.util.Scanner;

public class Boring_day{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=sc.nextInt(),r=sc.nextInt(),arr[]=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            int i=0,j=0,k=0,s=0;
            while(i<n){
                s+=arr[i++];
                while(s>r)s-=arr[j++];
                if(s>=l&&s<=r){
                    j=i;
                    k++;
                    s=0;
                }
            }
            System.out.println(k);
        }
    }
}