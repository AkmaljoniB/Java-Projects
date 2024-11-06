package Codeforces;

import java.util.Scanner;

public class Array_correction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            String s="YES";
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=n-2;i>=0;i--){
                if (arr[i]>arr[i+1]){
                    if (arr[i]%10<arr[i]/10||arr[i]%10>arr[i+1]){
                        s="NO";
                        break;
                    }else arr[i]/=10;
                }
            }
            System.out.println(s);
        }
    }
}
