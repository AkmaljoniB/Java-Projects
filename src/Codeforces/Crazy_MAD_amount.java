package Codeforces;

import java.util.*;

public class Crazy_MAD_amount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),p=0,arr[]=new int[n];
            long s=0;
            for(int i=0;i<n;i++)s+=arr[i]=sc.nextInt();
            while(p!=2){
                int l=0,num[]=new int[n+1];
                for(int i=0;i<n;i++){
                    num[arr[i]]++;
                    if(num[arr[i]]>1)l=Math.max(arr[i],l);
                    if(l!=0){
                        arr[i]=l;
                        s+=l;
                    }else{
                        arr[i]=0;
                    }
                }
                p++;
            }
            for(int i=0;i<n;i++)s+=(n-i-1)*(long)(arr[i]);
            System.out.println(s);
        }
    }
}
// 3 3 4 4 5 6 5 6
// 0 3 3 4 4 4 5 6
// 0 0 3 3 4 4 4 4