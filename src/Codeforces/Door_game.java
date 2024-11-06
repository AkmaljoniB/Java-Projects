package Codeforces;

import java.util.Scanner;

public class Door_game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt(),r=sc.nextInt(),L=sc.nextInt(),R=sc.nextInt();
            if(r<L||R<l)System.out.println(1);
            else if(L>=l&&R<=r){
                int p=R-L;
                if(R<r)p++;
                if(L>l)p++;
                System.out.println(p);
            }else if(l>=L&&r<=R){
                int p=r-l;
                if(r<R)p++;
                if(l>L)p++;
                System.out.println(p);
            }else if(l<L)System.out.println(r-L+2);
            else System.out.println(R-l+2);
        }
    }
}