package Codeforces;

import java.util.*;

public class Zelda_for_beginners{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=1,arr[]=new int[n+1];
            for(int i=1;i<n;i++){
                arr[sc.nextInt()]++;
                arr[sc.nextInt()]++;
            }
            for(int i=1;i<=n;i++)if(arr[i]==1)k++;
            System.out.println(k/2);
        }
    }
}