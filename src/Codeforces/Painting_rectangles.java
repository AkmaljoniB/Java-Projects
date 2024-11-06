package Codeforces;

import java.util.Scanner;

public class Painting_rectangles{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            if(n%3==0) System.out.println((n/3)*m);
            else if(m%3==0) System.out.println((m/3)*n);
            else {
                System.out.println(Math.min((m/3)*n+((m%3)*n%3==0?(m%3)*n/3:(m%3)*n/3+1),(n/3)*m)+((n%3)*m%3==0?(n%3)*m/3:(n%3)*m/3+1));
            }
        }
    }
}