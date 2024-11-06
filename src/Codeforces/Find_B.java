package Codeforces;

import java.util.Scanner;

public class Find_B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),q=sc.nextInt();
            long[]arr=new long[n+1],num=new long[n+1];
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==1)num[i]=1;
                arr[i]+=arr[i-1];
                num[i]+=num[i-1];
            }
            while(q-->0){
                int l=sc.nextInt(),r=sc.nextInt();
                System.out.println(l==r||((arr[r]-arr[l-1])/(r-l+1)==1&&(arr[r]-arr[l-1])%(r-l+1)<num[r]-num[l-1])?"NO":"YES");
            }
        }
    }
}