package Codeforces;

import java.util.Scanner;

public class Go_together {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x1=sc.nextInt(),y1=sc.nextInt();
            int x2=sc.nextInt(),y2=sc.nextInt();
            int x3=sc.nextInt(),y3=sc.nextInt();
            int l1=x3>x1&&x2>x1?Math.min(x3,x2)-x1:x3<x1&&x2<x1?x1-Math.max(x3,x2):0;
            int l2=y3>y1&&y2>y1?Math.min(y3,y2)-y1:y3<y1&&y2<y1?y1-Math.max(y3,y2):0;
            System.out.println(l2+l1+1);
        }
    }
}