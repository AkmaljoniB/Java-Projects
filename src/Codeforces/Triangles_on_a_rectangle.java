package Codeforces;

import java.util.Scanner;

public class Triangles_on_a_rectangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int w=sc.nextInt(),h=sc.nextInt();
            long max=0;
            for(int i=0;i<4;i++){
                int k=sc.nextInt(),l=sc.nextInt(),r=0;
                while(k-->1)r=sc.nextInt();
                if(i<2)max=Math.max(max,(long)(r-l)*h);
                else max=Math.max(max,(long)(r-l)*w);
            }
            System.out.println(max);
        }
    }
}