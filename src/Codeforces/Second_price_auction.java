package Codeforces;

import java.util.Scanner;

public class Second_price_auction{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=0,l=0,max2=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(max<a){
                max2=max;
                max=a;
                l=i+1;
            }else if(max2<a)max2=a;
        }
        System.out.println(l+" "+max2);
    }
}