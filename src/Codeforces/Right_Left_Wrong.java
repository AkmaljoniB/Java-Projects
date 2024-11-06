package Codeforces;

import java.util.Scanner;

public class Right_Left_Wrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long arr[]=new long[n+1],res=0;
            for(int i=1;i<=n;i++)arr[i]=arr[i-1]+sc.nextInt();
            String s=sc.next();
            int l=0,r=n-1;
            while(l<r){
                if(s.charAt(l)!='L')l++;
                if(s.charAt(r)!='R')r--;
                if(s.charAt(l)=='L'&&s.charAt(r)=='R'){
                    res+=arr[r+1]-arr[l];
                    l++;
                    r--;
                }
            }
            System.out.println(res);
        }
    }
}