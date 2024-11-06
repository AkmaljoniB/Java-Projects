package Codeforces;

import java.util.Scanner;

public class Petya_and_the_village{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=0,k=0,p=1,l=0,max=1;
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            if(a<b||(a==b&&l==0)){
                if(l==1){
                    max=Math.max(max,k);
                    k=p;
                    p=1;
                    l=0;
                }
                k++;
            }else{
                k++;
                if(a==b)p++;
                else p=1;
                l=1;
            }
            a=b;
        }
        System.out.println(Math.max(max,k));
    }
}