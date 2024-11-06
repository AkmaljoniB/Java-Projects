package Codeforces;

import java.util.Scanner;

public class Nice_couples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n+1],k=0;
            for(int i=1;i<=n;i++)arr[i]=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=Math.max(arr[i]-i,arr[i]-i%arr[i]);j<=n;j+=arr[i]){
                    if(i<j&&(long)arr[i]*arr[j]==i+j)k++;
                }
            }
            System.out.println(k);
        }
    }
}