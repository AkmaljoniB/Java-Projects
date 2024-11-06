package Codeforces;

import java.util.Scanner;

public class Minimum_number_of_operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0,s=0;
            while(n>=Math.pow(k,l+1)&&k!=1)l++;
            while(n>0){
                if(Math.pow(k,l)<=n){
                    int p=(int)(n/Math.pow(k,l));
                    s+=p;
                    n-=p*Math.pow(k,l);
                }
                l--;
            }
            System.out.println(s);
        }
    }
}