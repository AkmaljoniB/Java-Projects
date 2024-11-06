package Codeforces;

import java.util.Scanner;

public class Guess_the_maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),a=sc.nextInt(),min=Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                int b=sc.nextInt();
                min=Math.min(min,Math.max(b,a));
                a=b;
            }
            System.out.println(min-1);
        }
    }
}