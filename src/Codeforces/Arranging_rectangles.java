package Codeforces;

import java.util.Scanner;

public class Arranging_rectangles{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m1=0,m2=0;
            for(int i=0;i<n;i++){
                m1=Math.max(m1,sc.nextInt());
                m2=Math.max(m2,sc.nextInt());
            }
            System.out.println(2*(m1+m2));
        }
    }
}