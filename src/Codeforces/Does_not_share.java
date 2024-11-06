package Codeforces;

import java.util.Scanner;

public class Does_not_share{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),a=sc.nextInt(),l=Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                int b=sc.nextInt();
                if(b%a==0)a++;
                if(a%l==0)a++;
                System.out.print(a+" ");
                l=a;
                a=b;
            }
            System.out.println(a%l==0?a+1:a);
        }
    }
}