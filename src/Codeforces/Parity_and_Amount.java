package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Parity_and_Amount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0;
            long max=0;
            Integer[]arr=new Integer[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]%2!=0)max=Math.max(max,arr[i]);
            }
            if(max!=0){
                Arrays.sort(arr);
                for(int i=0;i<n;i++){
                    if(arr[i]%2==0){
                        l++;
                        if(max!=Integer.MAX_VALUE){
                            if(arr[i]>max){
                                l++;
                                max=Integer.MAX_VALUE;
                            }else max+=arr[i];
                        }
                    }
                }
            }
            System.out.println(max==0?0:l);
        }
    }
}