package Codeforces;

import java.util.Scanner;

public class King_s_Shortest_Path{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),t=sc.next(),r="";
        int x1=s.charAt(0)-'a',x2=t.charAt(0)-'a',y1=s.charAt(1)-'0',y2=t.charAt(1)-'0',k=0;
        while(x1!=x2||y1!=y2){
            if(x1<x2){
                r=r+"R";
                x1++;
            }else if(x1>x2){
                r=r+"L";
                x1--;
            }
            if(y1<y2){
                r=r+"U";
                y1++;
            }else if(y1>y2){
                r=r+"D";
                y1--;
            }
            r=r+"\n";
            k++;
        }
        System.out.println(k+"\n"+r);
    }
}