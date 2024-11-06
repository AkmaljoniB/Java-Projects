package Codeforces;

import java.util.Scanner;

public class Seller_Karel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=sc.nextInt(),max=0;
            long s=0;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                s+=a;
                max=Math.max(max,a);
            }
            System.out.println(Math.max((s+x-1)/x,max));
        }
    }
}