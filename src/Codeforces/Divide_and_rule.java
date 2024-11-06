package Codeforces;

import java.util.Scanner;

public class Divide_and_rule{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),s=0,min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int a=sc.nextInt(),l=1;
                s+=a;
                while(a%2==a/2%2){
                    a/=2;
                    l++;
                }
                min=Math.min(min,l);
            }
            System.out.println(s%2==0?0:min);
        }
    }
}