package Codeforces;

import java.util.Scanner;

public class Maximum_amount_1946B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            int[]arr=new int[n];
            long s=0,p=0,max=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                s+=arr[i];
            }
            for(int i=0;i<n;i++){
                if(arr[i]+p>=0){
                    p+=arr[i];
                    max=Math.max(max,p);
                }else p=0;
            }
            while(k-->0){
                s=(1000000007+s+max)%1000000007;
                max=(1000000007+max+max)%1000000007;
            }
            System.out.println(s);
        }
    }
}