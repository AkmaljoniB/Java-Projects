package Codeforces;

import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0;
            if(k-n>=0){
                l=1;
                k-=n;
            }
            for(int i=n-1;i>0;i--){
                if(k-i<0)break;
                k-=i;
                l++;
                if(k-i<0)break;
                k-=i;
                l++;
            }
            System.out.println(k!=0?l+1:l);
        }
    }
}