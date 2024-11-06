package Alexeev;

import java.util.Scanner;

public class Alexeev_0084{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),min=m,max=0,l=-1,r=0;
        String[]st=new String[n];
        for(int i=0;i<n;i++){
            st[i]=sc.next();
            if(st[i].contains("*")){
                if(l==-1)l=i;
                min=Math.min(st[i].indexOf("*"),min);
                max=Math.max(st[i].lastIndexOf("*"),max);
                r=i;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i>=l&&i<=r&&j>=min&&j<=max)System.out.print("*");
                else System.out.print(".");
            }
            System.out.println();
        }
    }
}