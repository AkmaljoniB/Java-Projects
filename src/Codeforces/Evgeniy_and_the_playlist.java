package Codeforces;

import java.util.*;

public class Evgeniy_and_the_playlist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),j=0;
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            int c=sc.nextInt(),t=sc.nextInt();
            arr[i]=(long)c *t;
        }
        long s=arr[0];
        for(int i=0;i<m;i++){
            long v=sc.nextLong();
            while(v>s)s+=arr[++j];
            System.out.println(j+1);
        }
    }
}