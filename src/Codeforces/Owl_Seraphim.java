package Codeforces;

import java.util.Scanner;

public class Owl_Seraphim {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            long s=0;
            int[]a=new int[n],b=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n;i++)b[i]=sc.nextInt();
            for(int i=n-1;i>=m;i--)s+=Math.min(a[i],b[i]);
            long min=s+a[m-1],p=b[m-1];
            for(int i=m-2;i>=0;i--){
                min=Math.min(min,s+p+a[i]);
                p+=b[i];
            }
            System.out.println(min);
        }
    }
}