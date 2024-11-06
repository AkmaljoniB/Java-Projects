package Codeforces;

import java.util.Scanner;

public class Maximize{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt(),max=0,l=1;
            for(int i=x-1;i>0;i--){
                if(max<gcd(x,i)+i){
                    l=i;
                    max=gcd(x,i)+i;
                }
            }
            System.out.println(l);
        }
    }
    public static int gcd(int a,int b) {
        if(b==0)return a;
        return gcd(b,a%b);
    }
}