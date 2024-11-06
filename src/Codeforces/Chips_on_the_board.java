package Codeforces;

import java.util.Scanner;

public class Chips_on_the_board {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextInt(),s1=sc.nextInt(),min1=s1;
            for (int i=1;i<n;i++){
                int a=sc.nextInt();
                min1=Math.min(min1,a);
                s1+=a;
            }
            long s2=sc.nextInt(),min2=s2;
            for (int i=1;i<n;i++){
                int a=sc.nextInt();
                min2=Math.min(min2,a);
                s2+=a;
            }
            System.out.println(Math.min(s1+min2*n,s2+min1*n));
        }
    }
}