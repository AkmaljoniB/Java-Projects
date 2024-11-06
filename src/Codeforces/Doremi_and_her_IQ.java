package Codeforces;

import java.util.Scanner;

public class Doremi_and_her_IQ{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),q=sc.nextInt();
            int[]arr=new int[n],ars=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]>q)ars[i]=1;
            }
            for(int i=0;i<n;i++)System.out.print(ars[i]+" ");
            System.out.println();
        }
    }
}