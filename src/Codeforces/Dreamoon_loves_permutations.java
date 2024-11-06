package Codeforces;

import java.util.*;

public class Dreamoon_loves_permutations{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int[]a=new int[k],t=new int[k];
            for(int i=0;i<k;i++)a[i]=sc.nextInt();
            for(int i=0;i<k;i++)t[i]=sc.nextInt();
            int l=0,r=0,p=0;
            while(r<n){
                int min=Integer.MAX_VALUE;
                for(int j=0;j<k;j++){
                    if(min>t[j]+Math.abs(a[j]-r-1)){
                        min=t[j]+Math.abs(a[j]-r-1);
                        p=a[j];
                    }
                }
                r=p;
                for(int i=l;i<r;i++)System.out.print((min-i+l)+" ");
                if(l>=r){
                    System.out.print(min+" ");
                    l++;
                    r=l;
                }
                l=r;
            }
            System.out.println();
        }
    }
}