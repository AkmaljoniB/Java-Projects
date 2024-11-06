package Codeforces;

import java.util.*;

public class Light_switches {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),max=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                max=Math.max(max,arr[i]);
            }
            int num[][]=new int[n][2],l=max,r=max+k;
            for(int i=0;i<n;i++){
                if(arr[i]!=max){
                    if((max-arr[i])/k%2!=0){
                        num[i][0]=max+k-1-(max-arr[i])%k+1;
                        num[i][1]=max+k-1;
                    }else{
                        num[i][0]=max;
                        num[i][1]=max+k-(max-arr[i])%k-1;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(num[i][0]!=0){
                    l=Math.max(l,num[i][0]);
                    r=Math.min(r,num[i][1]);
                }
            }
            System.out.println(l<=r?l:-1);
        }
    }
}