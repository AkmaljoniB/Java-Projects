package Alexeev;

import java.util.Scanner;

public class Alexeev_0213{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        int l=sc.nextInt(),m=sc.nextInt(),max=0;
        for(int j=0;j<m;j++){
            int s=0,p=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a==1)s+=arr[i];
                p+=a;
            }
            s-=j*2;
            if(p==n)s+=l;
            max=Math.max(max,s);
            System.out.println(max);
        }
    }
}