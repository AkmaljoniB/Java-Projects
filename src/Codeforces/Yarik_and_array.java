package Codeforces;

import java.util.Scanner;

public class Yarik_and_array {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),max=Integer.MIN_VALUE,l=1;
            int[]arr=new int[n+1],num=new int[n+1];
            for(int i=1;i<=n;i++){
                num[i]=arr[i]=sc.nextInt();
                if(Math.abs(arr[i]%2)!=Math.abs(arr[i-1]%2))num[i]+=num[i-1];
                else{
                    max=Math.max(max,func(num,l,i));
                    l=i;
                }
            }
            System.out.println(Math.max(max,func(num,l,n+1)));
        }
    }
    static int func(int[]num,int l,int i){
        int res=Integer.MIN_VALUE,min=0;
        for(int j=l;j<i;j++){
            res=Math.max(res,num[j]-min);
            min=Math.min(min,num[j]);
        }
        return res;
    }
}