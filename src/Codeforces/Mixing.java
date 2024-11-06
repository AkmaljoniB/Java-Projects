package Codeforces;

import java.util.Scanner;

public class Mixing{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt(),m=sc.nextInt(),l1=0,r1=0;
            for(int i=0;i<m;i++){
                int l=sc.nextInt(),r=sc.nextInt();
                if(x>=l&&x<=r&&l1==0&&r1==0){
                    l1=l;
                    r1=r;
                }
                if(r>=l1)l1=Math.min(l1,l);
                if(l<=r1)r1=Math.max(r,r1);
            }
            System.out.println(r1-l1+1);
        }
    }
}