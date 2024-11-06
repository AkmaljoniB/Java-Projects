package Codeforces;

import java.util.Scanner;

public class Fibonacci_segment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==1) System.out.println(1);
        else{
            int a=sc.nextInt(),b=sc.nextInt(),k=2,max=2;
            for (int i=2;i<n; i++) {
                int c=sc.nextInt();
                if(a+b==c){
                    k++;
                    max=Math.max(max,k);
                }else k=2;
                a=b;
                b=c;
            }
            System.out.println(max);
        }
    }
}