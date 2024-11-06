package Codeforces;

import java.util.Scanner;

public class Picture_frames{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=0,p=0;
        int[]arr=new int[101];
        for (int i=0;i<n;i++)arr[sc.nextInt()]++;
        for (int i=1;i<101;i++){
            l+=arr[i]/4;
            if (arr[i]%4>1)p++;
        }
        System.out.println(l+p/2);
    }
}