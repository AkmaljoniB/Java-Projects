package Codeforces;

import java.util.Scanner;

public class Destroyer{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[101];
            String s="YES";
            for(int i=0;i<n;i++)arr[sc.nextInt()]++;
            for(int i=0;i<100;i++){
                if(arr[i]<arr[i+1]){
                    s="NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}