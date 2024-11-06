package Codeforces;

import java.util.Scanner;

public class Two_cakes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        for(int i=Math.min((a+b)/n,Math.min(a,b));i>0;i--){
            if(a/i+b/i>=n){
                System.out.println(i);
                break;
            }
        }
    }
}