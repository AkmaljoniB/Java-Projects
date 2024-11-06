package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Give_team{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt(),k=0,l=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                if(a>=x)k++;
                else arr[i]=a;
            }
            Arrays.sort(arr);
            for(int i=n-1;i>=0;i--){
                if(arr[i]==0)break;
                else{
                    l++;
                    if(l*arr[i]>=x){
                        k++;
                        l=0;
                    }
                }
            }
            System.out.println(k);
        }
    }
}