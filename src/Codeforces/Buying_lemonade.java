package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Buying_lemonade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            long p=k;
            Integer[]arr=new Integer[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            p-=(long)arr[0] *n;
            if(p<=0)System.out.println(k);
            else{
                long l=0;
                int j=0;
                for(int i=1;i<n;i++){
                    if(arr[i]-arr[j]!=0){
                        p-= (long) (arr[i] - arr[j]) *(n-i);
                        l+=i-j;
                        j=i;
                        if(p<=0)break;
                    }
                }
                System.out.println(l +k);
            }
        }
    }
}