package Codeforces;

import java.util.Scanner;

public class Ternary_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x1=sc.nextInt(),y1=sc.nextInt(),z1=sc.nextInt();
            int x2=sc.nextInt(),y2=sc.nextInt(),z2=sc.nextInt();
            long s=0,a=Math.min(y2,z1);
            s+=2*a;
            z1-=a;
            z2-=Math.min(x1+z1,z2);
            s-=z2* 2L;
            System.out.println(s);
        }
    }
}