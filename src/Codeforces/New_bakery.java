package Codeforces;

import java.util.Scanner;

public class New_bakery{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
            long s=0;
            if(b>a){
                int k=b-Math.min(b-a,n)+1;
                s=(long)(b+k)*(b-k+1)/2;
                n-=Math.min(b-a,n);
            }
            System.out.println(s+(long)a*n);
        }
    }
}