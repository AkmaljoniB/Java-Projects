package Codeforces;

import java.util.Scanner;

public class Square {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for (int t=sc.nextInt();t-->0;){
            int x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),x3=sc.nextInt(),y3=sc.nextInt(),x4=sc.nextInt(),y4=sc.nextInt();
            if (x2!=x3&&y3!=y2){
                x1=x3;
                y1=y3;
            }else if (x4!=x3 && y4!=y3){
                x1=x3;
                y1=y3;
                x2=x4;
                y2=y4;
            } else if (x1!=x3 && y1!=y3){
                x2=x3;
                y2=y3;
            } else if (x1!=x4 && y1!=y4){
                x2=x4;
                y2=y4;
            } else if (x2!=x4 && y2!=y4){
                x1=x4;
                y1=y4;
            }
            long s = (long) Math.abs(x1 - x2) *Math.abs(y1-y2);
            System.out.println(s);
        }
    }
}