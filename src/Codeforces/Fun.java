package Codeforces;

import java.util.Scanner;

public class Fun {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt();
            long k=0;
            for(int i=1;i<=x;i++) {
                int min,j=0;
                while(++j<=x){
                    min=Math.min(x-i-j,(n-i*j)/(i+j));
                    if(min<=0)break;
                    k+=min;
                }
            }
            System.out.println(k);
        }
    }
}