package Codeforces;

import java.util.Scanner;

public class GCD_sequence {
    static int a[],arr[],n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            int b[]=new int[n],l=-1;
            a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(l==-1&&i>0){
                    b[i-1]=gcd(a[i-1],a[i]);
                    if(i>1&&b[i-2]>b[i-1])l=i;
                }
            }
            String s="Yes";
            if(l!=-1){
                arr=new int[n];
                if(func(l).length()==2)if(func(l-1).length()==2)s=func(l-2);
            }
            System.out.println(s);
        }
    }
    static String func(int l){
        int p=l==0?1:0;
        for(int i=1;i<n-1;i++){
            if(i==l){
                arr[i-1]=gcd(a[i-1],a[i+1]);
                if(i>1&&arr[i-2]>arr[i-1])return "NO";
                p=1;
            }else{
                arr[i-1]=gcd(a[i-1+p],a[i+p]);
                if(i>1&&arr[i-2]>arr[i-1])return "NO";
            }
        }
        return "YES";
    }
    static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
}