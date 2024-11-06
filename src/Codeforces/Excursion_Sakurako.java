package Codeforces;

import java.util.Scanner;

public class Excursion_Sakurako {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,arr[]=new int[n+1];
            for(int i=1;i<=n;i++)arr[i]=sc.nextInt();
            for(int i=2;i<=n/2;i++){
                if(arr[i]==arr[i-1]||arr[n-i+1]==arr[n-i+2]){
                    int q=arr[i];
                    arr[i]=arr[n-i+1];
                    arr[n-i+1]=q;
                }
            }
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i+1])l++;
            }
            System.out.println(l);
        }
    }
}