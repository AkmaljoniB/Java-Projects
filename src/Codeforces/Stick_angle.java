package Codeforces;

import java.util.Scanner;

public class Stick_angle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=0;
            int[]arr=new int[101];
            for(int i=0;i<n;i++)arr[sc.nextInt()]++;
            for(int i=1;i<=100;i++)k+=arr[i]/3;
            System.out.println(k);
        }
    }
}