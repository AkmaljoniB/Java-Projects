package Codeforces;

import java.util.Scanner;

public class Black_cells {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long a[]=new long[n],max=1;
            for(int i=0;i<n;i++)a[i]=sc.nextLong();
            for(int i=1;i<n;i+=2)max=Math.max(max,a[i]-a[i-1]);
            if(n%2==1){
                for(int i=0;i<n;i++){
                    long ans=1;
                    for(int j=0;j<i;j+=2)ans=Math.max(a[j+1]-a[j],ans);
                    for(int j=i+1;j<n-1;j+=2)ans=Math.max(ans,a[j+1]-a[j]);
                    max=Math.min(max,ans);
                }
            }
            System.out.println(max);
        }
    }
}