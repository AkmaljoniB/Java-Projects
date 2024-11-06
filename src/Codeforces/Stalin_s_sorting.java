package Codeforces;

import java.util.Scanner;

public class Stalin_s_sorting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n],min=n;
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                int q=i;
                for(int j=i+1;j<n;j++){
                    if(arr[j]>arr[i])q++;
                }
                min=Math.min(min,q);
            }
            System.out.println(min);
        }
    }
}