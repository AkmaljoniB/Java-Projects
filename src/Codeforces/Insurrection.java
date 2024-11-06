package Codeforces;

import java.util.Scanner;

public class Insurrection{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,k=0;
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i]==0)l++;
            }
            for(int i=0;i<n;i++){
                if(k>=l)break;
                if(arr[i]==0)l--;
                else k++;
            }
            System.out.println(k);
        }
    }
}