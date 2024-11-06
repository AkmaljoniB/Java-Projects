package Codeforces;

import java.util.Scanner;

public class Black_circles {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[][]=new int[n][2];
            for(int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }
            String s="YES";
            int xs=sc.nextInt(),ys=sc.nextInt(),xe=sc.nextInt(),ye=sc.nextInt();
            long d=(long)(xe-xs)*(xe-xs)+(long)(ye-ys)*(ye-ys);
            for(int i=0;i<n;i++){
                long dx=arr[i][0]-xe,dy=arr[i][1]-ye;
                if(d>=dx*dx+dy*dy){
                    s="NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}