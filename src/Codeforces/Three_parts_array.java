package Codeforces;

import java.util.Scanner;

public class Three_parts_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=0,r=n-1;
        long k=0;
        long[]a=new long[n],b=new long[n];
        for(int i=0;i<n;i++)a[i]=b[i]=sc.nextInt();
        for(int i=1;i<n;i++)a[i]+=a[i-1];
        for(int i=n-2;i>=0;i--)b[i]+=b[i+1];
        while(l<r){
            if(a[l]==b[r]){
                k=a[l];
                l++;
                r--;
            } else if(a[l]<b[r])l++;
            else r--;
        }
        System.out.println(k);
    }
}