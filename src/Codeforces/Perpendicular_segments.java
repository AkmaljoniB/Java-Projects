package Codeforces;

import java.util.Scanner;

public class Perpendicular_segments{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt(),y=sc.nextInt(),k=sc.nextInt(),min=Math.min(x,y);
            if(min>=k){
                System.out.println("0 0 0 "+k);
                System.out.println("0 0 "+k+" 0");
            }else{
                System.out.println((x-min)+" "+(y-min)+" "+x+" "+y);
                System.out.println("0 "+min+" "+min+" 0");
            }
        }
    }
}